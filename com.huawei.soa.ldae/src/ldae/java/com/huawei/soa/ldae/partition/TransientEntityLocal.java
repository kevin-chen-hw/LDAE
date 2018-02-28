package com.huawei.soa.ldae.partition;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by z00219996 on 2018/1/15.
 */
public class TransientEntityLocal
{
    private static  ThreadLocal<Object> LOCAL =  new ThreadLocal<Object>();

    public static Object getCurrent()
    {
        return LOCAL.get();
    }

    public static void set(Object object)
    {
        if (null != object)
        {
            LOCAL.set(object);
        }
    }

    public static void destroy()
    {
        if (null != LOCAL.get())
        {
            LOCAL.remove();
        }
    }
}
