package com.zhl.custommybatis.custom_mybatis.mapping;

import com.zhl.custommybatis.custom_mybatis.base.executor.reflection.MetaObject;

import java.util.List;
import java.util.Map;

/**
 * @author hailang.zhang
 * @since 2024-04-02
 */
public class BoundSql {

    private final String sql;
    private final List<ParameterMapping> parameterMappings;
    private final Object parameterObject;
    private final Map<String, Object> additionalParameters;
    private final MetaObject metaObject;

    public BoundSql(String sql, List<ParameterMapping> parameterMappings, Object parameterObject, Map<String, Object> additionalParameters, MetaObject metaObject) {
        this.sql = sql;
        this.parameterMappings = parameterMappings;
        this.parameterObject = parameterObject;
        this.additionalParameters = additionalParameters;
        this.metaObject = metaObject;
    }

    public String getSql() {
        return sql;
    }

    public List<ParameterMapping> getParameterMappings() {
        return parameterMappings;
    }

    public Object getParameterObject() {
        return parameterObject;
    }

    public Map<String, Object> getAdditionalParameters() {
        return additionalParameters;
    }

    public MetaObject getMetaObject() {
        return metaObject;
    }
}