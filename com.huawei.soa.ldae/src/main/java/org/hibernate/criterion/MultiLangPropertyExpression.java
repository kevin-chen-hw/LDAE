package org.hibernate.criterion;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.TypedValue;

public class MultiLangPropertyExpression implements Criterion
{
    
    private static final TypedValue[] NO_TYPED_VALUES = new TypedValue[0];
    
    private final String propertyName;
    private final String otherPropertyName;
    private final String op;

    protected MultiLangPropertyExpression(String propertyName, String otherPropertyName, String op){
        this.propertyName = propertyName;
        this.otherPropertyName = otherPropertyName;
        this.op = op;
    }
    
    public String getOp(){
        return op;
    }
    
    public String getPropertryName(){
        return propertyName;
    }
    
    public String getOtherPropertryName(){
        return otherPropertyName;
    }
    
    @Override
    public String toSqlString(Criteria criteria, CriteriaQuery criteriaQuery) throws HibernateException{
        return this.toString();
    }
    
    @Override
    public TypedValue[] getTypedValues(Criteria criteria, CriteriaQuery criteriaQuery){
        return NO_TYPED_VALUES;
    }
    
    @Override
    public String toString(){
        return propertyName + getOp() + otherPropertyName;
    }
    
}
