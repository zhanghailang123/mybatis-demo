package com.zhl.custommybatis.custom_mybatis.base.executor;

import com.zhl.custommybatis.custom_mybatis.cache.CacheKey;
import com.zhl.custommybatis.custom_mybatis.cache.impl.PerpetualCache;
import com.zhl.custommybatis.custom_mybatis.mapping.BoundSql;
import com.zhl.custommybatis.custom_mybatis.mapping.MappedStatement;
import com.zhl.custommybatis.custom_mybatis.session.ResultHandler;
import com.zhl.custommybatis.custom_mybatis.session.RowBounds;

import java.util.List;

/**
 * @author hailang.zhang
 * @since 2024-03-31
 */
public abstract class BaseExecutor implements Executor{

    protected Executor wrapper;
    private PerpetualCache localCache;
    private boolean closed;
    protected int queryStack;

    @Override
    public int update(MappedStatement ms, Object parameter) {
        return 0;
    }

    @Override
    public <E> List<E> query(MappedStatement ms, Object parameter, RowBounds rowBounds,
            ResultHandler resultHandler, CacheKey cacheKey, BoundSql boundSql) {
        if (closed) {
            throw new IllegalStateException();
        }

        List<E> list;
        try {
            queryStack ++;
            list = resultHandler == null ? (List<E>) localCache.getObject(cacheKey) : null;
            if (list != null) {
                //处理下缓存的东西？
            } else {
                list = queryFromDataBase(ms, parameter, rowBounds, resultHandler, cacheKey, boundSql);
            }
        } finally {
            queryStack --;
        }

        return list;
    }

    private <E> List<E> queryFromDataBase(MappedStatement ms, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, CacheKey key, BoundSql boundSql) {
        List<E> list;
        localCache.putObject(key, "放入占位符");
        try {
            list = doQuery(ms, parameter, rowBounds, resultHandler, boundSql);
        } finally {
            localCache.removeObject(key);
        }
        localCache.putObject(key, list);
        return list;
    }

    protected abstract <E> List<E> doQuery(MappedStatement ms, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql);
}