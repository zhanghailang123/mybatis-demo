package com.zhl.custommybatis.custom_mybatis.session;

/**
 * @author hailang.zhang
 * @since 2024-04-02
 */
public interface ResultContext<T> {

    T getResultObject();

    int getResultCount();

    boolean isStopped();

    void stop();
}
