package com.zhl.custommybatis.custom_mybatis.base.executor;

import com.zhl.custommybatis.custom_mybatis.base.Configuration;
import com.zhl.custommybatis.custom_mybatis.base.executor.statement.StatementHandler;
import com.zhl.custommybatis.custom_mybatis.mapping.BoundSql;
import com.zhl.custommybatis.custom_mybatis.mapping.MappedStatement;
import com.zhl.custommybatis.custom_mybatis.session.ResultHandler;
import com.zhl.custommybatis.custom_mybatis.session.RowBounds;

import java.sql.Statement;
import java.util.List;

/**
 * @author hailang.zhang
 * @since 2024-04-03
 */
public class SimpleExecutor extends BaseExecutor{

    @Override
    protected <E> List<E> doQuery(MappedStatement ms, Object parameter, RowBounds rowBounds, ResultHandler resultHandler, BoundSql boundSql) {
        Statement stmt = null;
        Configuration configuration = ms.getConfiguration();
        StatementHandler handler = configuration.newStatementHandler(wrapper, ms, parameter, rowBounds, resultHandler, boundSql);
        return null;
    }
}