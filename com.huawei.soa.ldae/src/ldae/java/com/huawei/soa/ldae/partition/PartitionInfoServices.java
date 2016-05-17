package com.huawei.soa.ldae.partition;

import java.math.BigDecimal;
import java.util.Map;

import org.hibernate.service.Service;

public interface PartitionInfoServices extends Service
{
    public PartitionInfo getPartitionInfo(Map obj);

    public PartitionInfo getPartitionInfo(String voTypeName);

    public BigDecimal getCurrentPartitionValue();

    public void setCurrentPartitionValue(BigDecimal value);

    public void removeCurrentPartitionValue();
}
