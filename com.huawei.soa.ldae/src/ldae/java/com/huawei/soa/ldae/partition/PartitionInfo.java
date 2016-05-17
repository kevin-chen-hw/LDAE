package com.huawei.soa.ldae.partition;

/**
 * 
 */
public class PartitionInfo
{
    private final boolean partition;

    private String columnName;

    private String fieldName;

    public PartitionInfo(boolean partition)
    {
        this.partition = partition;
    }
    public boolean isPartition()
    {
        return partition;
    }


    public String getColumnName()
    {
        return columnName;
    }

    public void setColumnName(String columnName)
    {
        this.columnName = columnName;
    }

    public String getFieldName()
    {
        return fieldName;
    }

    public void setFieldName(String fieldName)
    {
        this.fieldName = fieldName;
    }


}
