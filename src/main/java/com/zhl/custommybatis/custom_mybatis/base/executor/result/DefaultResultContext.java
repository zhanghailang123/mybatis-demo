package com.zhl.custommybatis.custom_mybatis.base.executor.result;

import com.zhl.custommybatis.custom_mybatis.session.ResultContext;

/**
 * @author hailang.zhang
 * @since 2024-04-02
 */
public class DefaultResultContext<T> implements ResultContext<T> {

    private T resultObject;
    private int resultCount;
    private boolean stopped;

    public DefaultResultContext() {
        this.resultObject = null;
        this.resultCount = 0;
        this.stopped = false;
    }

    @Override
    public T getResultObject() {
        return resultObject;
    }

    @Override
    public int getResultCount() {
        return resultCount;
    }

    @Override
    public boolean isStopped() {
        return stopped;
    }

    @Override
    public void stop() {
        this.stopped = true;
    }

    public void nextResultObject(T resultObject) {
        resultCount ++;
        this.resultObject = resultObject;
    }
}