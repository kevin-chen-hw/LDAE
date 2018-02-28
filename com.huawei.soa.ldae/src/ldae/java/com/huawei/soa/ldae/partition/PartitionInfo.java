package com.huawei.soa.ldae.partition;

public class PartitionInfo
{
    private final boolean partition;

    private String[] columnNames;

    private String[] fieldNames;

    public PartitionInfo(boolean partition)
    {
        this.partition = partition;
    }
    public boolean isPartition()
    {
        return partition;
    }


    public String[] getColumnName()
    {
        return columnNames;
    }

    public void setColumnName(String[] columnName)
    {
        this.columnNames = columnName;
    }

    public String[] getFieldName()
    {
        return fieldNames;
    }

    public void setFieldName(String[] fieldName)
    {
        this.fieldNames = fieldName;
    }


}
