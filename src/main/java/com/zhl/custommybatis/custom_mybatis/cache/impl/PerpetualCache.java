package com.zhl.custommybatis.custom_mybatis.cache.impl;

import com.zhl.custommybatis.custom_mybatis.cache.Cache;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hailang.zhang
 * @since 2024-04-03
 */
public class PerpetualCache implements Cache {

    private final String id;

    private final Map<Object, Object> cache = new HashMap<>();

    public PerpetualCache(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void putObject(Object key, Object value) {
        cache.put(key, value);
    }

    @Override
    public Object getObject(Object key) {
        return cache.get(key);
    }

    @Override
    public Object removeObject(Object key) {
        return cache.remove(key);
    }

    @Override
    public void clear() {
        cache.clear();
    }

    @Override
    public int getSize() {
        return cache.size();
    }

    /**
     * todo 重写equals和hashcode方法
     * 需要全部重新学习下这块东西
     */
}