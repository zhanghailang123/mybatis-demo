package com.zhl.custommybatis.custom_mybatis.base.executor.statement;

import com.zhl.custommybatis.custom_mybatis.base.executor.result.ResultSetHandler;
import com.zhl.custommybatis.custom_mybatis.mapping.BoundSql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author hailang.zhang
 * @since 2024-04-03
 */
public abstract class BaseStatementHandler implements StatementHandler{

    protected ResultSetHandler resultSetHandler;
    protected BoundSql boundSql;

    @Override
    public Statement prepare(Connection connection, Integer transactionalTimeout) {
        return null;
    }

    protected abstract Statement instantiateStatement(Connection connection);

    protected void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                //ignore,there is nothing can do
            }
        }
    }

    @Override
    public BoundSql getBoundSql() {
        return boundSql;
    }
}