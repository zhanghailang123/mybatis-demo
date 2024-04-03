package com.zhl.custommybatis.custom_mybatis.base.executor;

import com.zhl.custommybatis.custom_mybatis.cache.CacheKey;
import com.zhl.custommybatis.custom_mybatis.mapping.BoundSql;
import com.zhl.custommybatis.custom_mybatis.mapping.MappedStatement;
import com.zhl.custommybatis.custom_mybatis.session.ResultHandler;
import com.zhl.custommybatis.custom_mybatis.session.RowBounds;

import java.util.List;

/**
 * mybatis 最底层的 执行增删改查的执行器
 * @author hailang.zhang
 * @since 2024-03-31
 */
public interface Executor {

    int update(MappedStatement ms, Object parameter);

    <E> List<E> query(MappedStatement ms, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, CacheKey cacheKey, BoundSql boundSql);
}
