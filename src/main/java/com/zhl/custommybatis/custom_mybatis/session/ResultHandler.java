package com.zhl.custommybatis.custom_mybatis.session;

/**
 * @author hailang.zhang
 * @since 2024-04-02
 */
public interface ResultHandler<T>{

    void handleResult(ResultContext<? extends T> resultContext);

}
