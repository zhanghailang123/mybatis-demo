package com.zhl.custommybatis.custom_mybatis.binding;

/**
 * @author hailang.zhang
 * @since 2024-04-09
 */
public class MapperProxyFactory<T> {

    private final Class<T> mapperInterface;

    public MapperProxyFactory(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    public Class<T> getMapperInterface() {
        return mapperInterface;
    }
}