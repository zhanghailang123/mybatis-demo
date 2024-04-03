package com.zhl.custommybatis.custom_mybatis.session.impl;

import com.zhl.custommybatis.custom_mybatis.session.SqlSession;
import com.zhl.custommybatis.custom_mybatis.base.Configuration;
import com.zhl.custommybatis.custom_mybatis.base.executor.Executor;

/**
 * @author hailang.zhang
 * @since 2024-03-31
 */
public class DefaultSqlSession implements SqlSession {

    private final Configuration configuration;

    private final Executor executor;

    private final boolean autoCommit;

    private boolean dirty;


    public DefaultSqlSession(Configuration configuration, Executor executor) {
        this(configuration, executor, false);
    }

    public DefaultSqlSession(Configuration configuration, Executor executor, boolean autoCommit) {
        this.configuration = configuration;
        this.executor = executor;
        this.autoCommit = autoCommit;
    }
}