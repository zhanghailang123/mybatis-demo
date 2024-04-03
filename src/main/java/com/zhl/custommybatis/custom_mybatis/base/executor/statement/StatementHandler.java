package com.zhl.custommybatis.custom_mybatis.base.executor.statement;

import com.zhl.custommybatis.custom_mybatis.mapping.BoundSql;
import com.zhl.custommybatis.custom_mybatis.session.ResultHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * @author hailang.zhang
 * @since 2024-04-03
 */
public interface StatementHandler {

    Statement prepare(Connection connection, Integer transactionalTimeout);

    <E> List<E> query(Statement statement, ResultHandler resultHandler) throws SQLException;

    BoundSql getBoundSql();
}
