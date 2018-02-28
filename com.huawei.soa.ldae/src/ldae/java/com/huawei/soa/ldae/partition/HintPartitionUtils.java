package com.huawei.soa.ldae.partition;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.internal.CoreMessageLogger;
import org.hibernate.persister.entity.EntityPersister;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.Type;
import org.jboss.logging.Logger;
import utils.InnerTypeFactory;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by l00370624 on 2017/10/30.
 */
public class HintPartitionUtils
{
    private static final CoreMessageLogger LOG = Logger
            .getMessageLogger(CoreMessageLogger.class, HintPartitionUtils.class.getName());

    public static final String HINT_COLUMN_NAME = "$router";

    private static final String ROUTER_HINTS_PREFIX = "dds hintshardrule, ";

    public static final String HINT_ENITTY_NAME_KEY = "entityName";

    public static String getHintSql(String sql, Object hint)
    {
        if (null == sql)
        {
            return sql;
        }
        sql = sql.trim();
        String operation = sql.substring(0, 6);
        if (!("insert".equals(operation.toLowerCase()) || "delete".equals(operation.toLowerCase()) || "update"
                .equals(operation.toLowerCase())))
        {
            return sql;
        }

        int pos1 = sql.indexOf("/*", 6);
        int pos2 = sql.lastIndexOf("*/");
        if(pos1 != -1 && pos2 != -1 && pos1 < pos2)
        {
            sql = sql.substring(0, pos1).trim() + " " + sql.substring(pos2 + 2, sql.length()).trim();
        }

        String hintSql = getHintSql(hint instanceof Map ? ((Map) hint).get(HINT_COLUMN_NAME) : null);
        if (hintSql == null)
        {
            return sql;
        }
        StringBuilder result = new StringBuilder();
        result.append(sql.substring(0, 6)).append(" /* ").append(hintSql).append(" */ ")
                .append(sql.substring(6, sql.length()).trim());
        return result.toString();
    }

    public static int bindHintPartitionParam(final PreparedStatement ps, Object hint, int index,
            final SessionImplementor session) throws HibernateException, SQLException
    {
        if (!(hint instanceof Map))
        {
            return index;
        }
        for (Map.Entry<String, Object> entry : ((Map<String, Object>) hint).entrySet())
        {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (null != value && null != key && !("".equals(key)))
            {
                Type type = InnerTypeFactory.getInnerType(value.getClass());
                if (!(type instanceof AbstractSingleColumnStandardBasicType))
                {
                    String errorInfo =
                            "Hint partition params not support this type:" + type == null ? "null" : type.toString();
                    LOG.error(errorInfo);
                    throw new HibernateException(errorInfo);
                }
                type.nullSafeSet(ps, value, index, session);
                index++;
            }
        }
        return index;
    }

    public static String getHintSql(Object hint)
    {
        if (!(hint instanceof Map))
        {
            return null;
        }
        StringBuilder hintPartitionSql = new StringBuilder();
        for (Map.Entry<String, Object> entry : ((Map<String, Object>) hint).entrySet())
        {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (null != value && null != key && !("".equals(key)))
            {
                hintPartitionSql.append(entry.getKey()).append(" = ?, ");
            }
        }
        int pos = hintPartitionSql.lastIndexOf(",");
        if (pos == -1)
        {
            return null;
        }
        hintPartitionSql.deleteCharAt(pos);
        hintPartitionSql.insert(0, ROUTER_HINTS_PREFIX);
        return hintPartitionSql.toString().trim();
    }

    public static boolean isHintColmun(String[] columns)
    {
        if (null != columns && columns.length == 1 && HINT_COLUMN_NAME.equals(columns[0]))
        {
            return true;
        }
        return false;
    }

    public static boolean isHintPartition(EntityPersister entityPersister, Object obj)
    {
        if (entityPersister.getHintPartitionProperty() == -1)
        {
            return false;
        }
        return obj instanceof Map;
    }

    public static boolean isHintPartition(EntityPersister entityPersister, Object[] obj, int hintPatitionProperty)
    {
        if (entityPersister.getHintPartitionProperty() == -1)
        {
            return false;
        }
        return obj instanceof Object[] && obj.length >= hintPatitionProperty;
    }

    public static void convertHintToChild(Object parent, Object child, Type type)
    {
        if (parent instanceof Map && child instanceof Map)
        {
            Object hint = ((Map) parent).get(HINT_COLUMN_NAME);
            if (hint instanceof Map && !((Map) hint).isEmpty())
            {
                Map<String, Object> childHint = new LinkedHashMap<String, Object>();
                childHint.putAll((Map) hint);
                childHint.put(HINT_ENITTY_NAME_KEY, type.getName());
                ((Map) child).put(HINT_COLUMN_NAME, childHint);
            }
        }
    }

    public static String getSelectClauseWithRouterHints(String selectSql, Map<String, Object> routerHints)
    {
        String hintsStr = getHintSql(routerHints);
        if (null == hintsStr)
        {
            return selectSql;
        }

        StringBuffer hintsBuffer = new StringBuffer();
        hintsBuffer.append("/* ").append(hintsStr).append(" */ ");

        int pos1 = selectSql.indexOf("select");
        int pos2 = selectSql.indexOf("SELECT");
        int pos = pos1 == -1 ? pos2 : pos1;
        if (pos == -1)
        {
            return selectSql;
        }

        StringBuffer resultBuffer = new StringBuffer();
        if (pos > 0)
        {
            resultBuffer.append(selectSql.substring(0, pos));
        }
        resultBuffer.append("select ").append(hintsBuffer).append(selectSql.substring(pos + "select".length()));

        return resultBuffer.toString();
    }

}
