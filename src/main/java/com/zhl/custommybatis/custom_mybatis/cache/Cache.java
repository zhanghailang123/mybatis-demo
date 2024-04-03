package com.zhl.custommybatis.custom_mybatis.cache;

/**
 * @author hailang.zhang
 * @since 2024-04-02
 */
public interface Cache {

    String getId();

    void putObject(Object key, Object value);

    Object getObject(Object key);

    Object removeObject(Object key);

    void clear();

    int getSize();

}
