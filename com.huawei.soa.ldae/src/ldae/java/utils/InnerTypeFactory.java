package utils;

import org.hibernate.type.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Timestamp;
import java.util.*;

/**
 * Created by l00370624 on 2017/10/31.
 */
public class InnerTypeFactory
{
    private static final Map<Class<?>, Type> javaType2HibernateType = new HashMap<Class<?>, Type>(19);

    static
    {
        javaType2HibernateType.put(Integer.class, IntegerType.INSTANCE);
        javaType2HibernateType.put(BigInteger.class, BigIntegerType.INSTANCE);
        javaType2HibernateType.put(Long.class, LongType.INSTANCE);
        javaType2HibernateType.put(Short.class, ShortType.INSTANCE);
        javaType2HibernateType.put(Character.class, ShortType.INSTANCE);
        javaType2HibernateType.put(BigDecimal.class, BigDecimalType.INSTANCE);
        javaType2HibernateType.put(Float.class, FloatType.INSTANCE);
        javaType2HibernateType.put(Double.class, DoubleType.INSTANCE);
        javaType2HibernateType.put(Boolean.class, BooleanType.INSTANCE);
        javaType2HibernateType.put(String.class, StringType.INSTANCE);
        javaType2HibernateType.put(Date.class, DateType.INSTANCE);
        javaType2HibernateType.put(java.sql.Date.class, DateType.INSTANCE);
        javaType2HibernateType.put(Calendar.class, CalendarType.INSTANCE);
        javaType2HibernateType.put(Locale.class, LocaleType.INSTANCE);
        javaType2HibernateType.put(TimeZone.class, TimeZoneType.INSTANCE);
        javaType2HibernateType.put(Currency.class, CurrencyType.INSTANCE);
        javaType2HibernateType.put(Clob.class, ClobType.INSTANCE);
        javaType2HibernateType.put(Blob.class, BlobType.INSTANCE);
        javaType2HibernateType.put(Byte.class, ByteType.INSTANCE);
        javaType2HibernateType.put(Timestamp.class, TimestampType.INSTANCE);
    }

    public static Type getInnerType(Class<?> javaType)
    {
        return javaType2HibernateType.get(javaType);
    }

}
