package com.zhl.custommybatis.custom_mybatis.binding;

import com.zhl.custommybatis.custom_mybatis.session.SqlSession;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hailang.zhang
 * @since 2024-04-10
 */
public class MapperRegistry {

    private final Map<Class<?>, MapperProxyFactory<?>> knownMappers = new ConcurrentHashMap<>();

    public <T> T getMapper(Class<T> type, SqlSession session) {
        return null;
    }

    public <T> boolean hasMapper(Class<T> type) {
        return knownMappers.containsKey(type);
    }

    public <T> void addMapper(Class<T> type) {

    }
}