package com.huawei.soa.ldae.partition;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by z00219996 on 2017/11/10.
 */
public class HintPartitionParameters
{
    private static  ThreadLocal<Map<String, Object>> LOCAL =  new ThreadLocal<Map<String, Object>>();

    public static final String HINT_ENTITY_NAME = "entityName";

    public static Map<String, Object> getCurrent()
    {
        return LOCAL.get();
    }

    public static void set(Map<String, Object> hintsPrams)
    {
        if (null == LOCAL.get())
        {
            Map<String, Object> map = new HashMap<String, Object>();
            map.putAll(hintsPrams);
            LOCAL.set(map);
        }
        else
        {
            LOCAL.get().clear();
            LOCAL.get().putAll(hintsPrams);
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
