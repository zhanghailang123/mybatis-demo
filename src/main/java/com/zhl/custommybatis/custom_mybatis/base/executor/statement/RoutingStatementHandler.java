package com.zhl.custommybatis.custom_mybatis.base.executor.statement;

import com.zhl.custommybatis.custom_mybatis.base.executor.Executor;
import com.zhl.custommybatis.custom_mybatis.mapping.BoundSql;
import com.zhl.custommybatis.custom_mybatis.mapping.MappedStatement;
import com.zhl.custommybatis.custom_mybatis.session.ResultHandler;
import com.zhl.custommybatis.custom_mybatis.session.RowBounds;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * a simple wrapper
 * @author hailang.zhang
 * @since 2024-04-03
 */
public class RoutingStatementHandler implements StatementHandler{

    private final StatementHandler delegate;

    public RoutingStatementHandler(Executor executor, MappedStatement ms, Object parameter, RowBounds rowBounds,
            ResultHandler resultHandler, BoundSql boundSql) {
        this.delegate = new SimpleStatementHandler();
    }

    @Override
    public Statement prepare(Connection connection, Integer transactionalTimeout) {
        return null;
    }

    @Override
    public <E> List<E> query(Statement statement, ResultHandler resultHandler) throws SQLException {
        return null;
    }

    @Override
    public BoundSql getBoundSql() {
        return null;
    }
}