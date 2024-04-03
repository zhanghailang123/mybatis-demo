package com.zhl.custommybatis.custom_mybatis.base.executor.statement;

import com.zhl.custommybatis.custom_mybatis.session.ResultHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * @author hailang.zhang
 * @since 2024-04-03
 */
public class SimpleStatementHandler extends BaseStatementHandler{

    @Override
    protected Statement instantiateStatement(Connection connection) {
        return null;
    }

    @Override
    public <E> List<E> query(Statement statement, ResultHandler resultHandler) throws SQLException {
        String sql = boundSql.getSql();
        statement.execute(sql);
        return resultSetHandler.handleResultSets(statement);
    }
}