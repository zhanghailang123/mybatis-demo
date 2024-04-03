package com.zhl.custommybatis.custom_mybatis.base;

import com.zhl.custommybatis.custom_mybatis.base.executor.Executor;
import com.zhl.custommybatis.custom_mybatis.base.executor.statement.RoutingStatementHandler;
import com.zhl.custommybatis.custom_mybatis.base.executor.statement.StatementHandler;
import com.zhl.custommybatis.custom_mybatis.mapping.BoundSql;
import com.zhl.custommybatis.custom_mybatis.mapping.MappedStatement;
import com.zhl.custommybatis.custom_mybatis.session.ExecutorType;
import com.zhl.custommybatis.custom_mybatis.session.ResultHandler;
import com.zhl.custommybatis.custom_mybatis.session.RowBounds;
import com.zhl.custommybatis.custom_mybatis.transaction.Environment;
import com.zhl.custommybatis.custom_mybatis.transaction.Transaction;

/**
 * mybatis全局唯一？
 *
 * this is a parsed object
 * maybe from xml or yaml
 * @author hailang.zhang
 * @since 2024-03-31
 */
public class Configuration {

    public Environment getEnvironment() {
        return environment;
    }

    protected Environment environment;

    public ExecutorType getDefaultExecutorType() {
        return defaultExecutorType;
    }

    protected ExecutorType defaultExecutorType = ExecutorType.SIMPLE;

    public Executor newExecutor(Transaction transaction, ExecutorType execType) {
        execType = execType == null ? defaultExecutorType : execType;
        return null;
    }

    public StatementHandler newStatementHandler(Executor wrapper, MappedStatement ms, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql) {
        StatementHandler statementHandler = new RoutingStatementHandler(wrapper, ms, parameter, rowBounds, resultHandler, boundSql);
        return null;
    }
}