package com.huawei.soa.ldae.partition;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Map;

public class PartitionIntegrationFactory
{
    private final String GET_VO_TYPE_NAME = "getVoTypeName";

    private static PartitionIntegrationFactory INSTANCE = null;

    private Method partitionInfoResolverVoMethod = null;

    private Method partitionInfoResolverStrMethod = null;

    private Object partitionInfoResolver = null;

    private ThreadLocal<Object[]> threadLacal = new ThreadLocal<Object[]>();

    public static PartitionIntegrationFactory getInstance()
    {
        if (INSTANCE == null)
        {
            PartitionIntegrationFactory factory = new PartitionIntegrationFactory();
            try
            {
                Class<?> clazz = Class.forName("com.huawei.soa.bdf.partition.PartitionInfoResolver");

                factory.partitionInfoResolver = clazz.newInstance();
                factory.partitionInfoResolverVoMethod = clazz.getMethod("getPartitionInfo", Map.class);
                factory.partitionInfoResolverStrMethod = clazz.getMethod("getPartitionInfo", String.class);
                INSTANCE = factory;
            }
            catch (Exception e)
            {
            }
        }

        return INSTANCE;
    }

    public PartitionInfo getPartitionInfo(Map obj)
    {
        try
        {
            return (PartitionInfo) partitionInfoResolverVoMethod.invoke(partitionInfoResolver, obj);
        }
        catch (Exception e)
        {
            throw new RuntimeException("Get PartitionInfo error .", e);
        }
    }

    public PartitionInfo getPartitionInfo(String str)
    {
        try
        {
            return (PartitionInfo) partitionInfoResolverStrMethod.invoke(partitionInfoResolver, str);
        }
        catch (Exception e)
        {
            throw new RuntimeException("Get PartitionInfo error .", e);
        }
    }

    public Object[] getCurrentPartitionValue()
    {
        return threadLacal.get();
    }

    public void setCurrentPartitionValue(Object[] value)
    {
        threadLacal.set(value);
    }

    public void removeCurrentPartitionValue()
    {
        threadLacal.remove();
    }
}
