/*
 * Copyright © Huawei Technologies Co., Ltd. 1998-2007. All rights reserved.
 */
package org.hibernate.internal;

import java.util.Map;

import org.hibernate.cache.spi.RegionFactory;
import org.hibernate.engine.spi.Mapping;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.persister.spi.PersisterFactory;

/**
 * TODO添加类的一句话描述。
 * <p>
 * TODO 详细描述
 * <p>
 * TODO 示例代码
 * 
 * @author j00318686
 * @see
 *@since ONIP SOABean V300R003C00
 */
public class DebugContext
{
    private Mapping mappingCache;
    
    private Map<String, PersistentClass> entityPersistentClassMapCache;
    
    private Map<String, org.hibernate.mapping.FetchProfile> cfgFetchProfilesCache;
    
    private String cacheRegionPrefix;
    
    private Map entityAccessStrategies;
    
    private RegionFactory regionFactory;
    
    private PersisterFactory persisterFactory;
    
    private final Object mutexCreateEntityPersisterLock = new Object();

    public Mapping getMappingCache()
    {
        return mappingCache;
    }

    public void setMappingCache(Mapping mappingCache)
    {
        this.mappingCache = mappingCache;
    }

    public Map<String, PersistentClass> getEntityPersistentClassMapCache()
    {
        return entityPersistentClassMapCache;
    }

    public void setEntityPersistentClassMapCache(Map<String, PersistentClass> entityPersistntClassMapCache)
    {
        this.entityPersistentClassMapCache = entityPersistntClassMapCache;
    }

    public Map<String, org.hibernate.mapping.FetchProfile> getCfgFetchProfilesCache()
    {
        return cfgFetchProfilesCache;
    }

    public void setCfgFetchProfilesCache(Map<String, org.hibernate.mapping.FetchProfile> cfgFetchProfilesCache)
    {
        this.cfgFetchProfilesCache = cfgFetchProfilesCache;
    }

    public String getCacheRegionPrefix()
    {
        return cacheRegionPrefix;
    }

    public void setCacheRegionPrefix(String cacheRegionPrefix)
    {
        this.cacheRegionPrefix = cacheRegionPrefix;
    }

    public Map getEntityAccessStrategies()
    {
        return entityAccessStrategies;
    }

    public void setEntityAccessStrategies(Map entityAccessStrategies)
    {
        this.entityAccessStrategies = entityAccessStrategies;
    }

    public RegionFactory getRegionFactory()
    {
        return regionFactory;
    }

    public void setRegionFactory(RegionFactory regionFactory)
    {
        this.regionFactory = regionFactory;
    }

    public PersisterFactory getPersisterFactory()
    {
        return persisterFactory;
    }

    public void setPersisterFactory(PersisterFactory persisterFactory)
    {
        this.persisterFactory = persisterFactory;
    }

    public Object getMutexCreateEntityPersisterLock()
    {
        return mutexCreateEntityPersisterLock;
    }
}