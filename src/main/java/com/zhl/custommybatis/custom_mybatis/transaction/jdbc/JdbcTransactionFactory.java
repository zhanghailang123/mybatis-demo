package com.zhl.custommybatis.custom_mybatis.transaction.jdbc;

import com.zhl.custommybatis.custom_mybatis.transaction.Transaction;
import com.zhl.custommybatis.custom_mybatis.transaction.TransactionFactory;
import com.zhl.custommybatis.custom_mybatis.transaction.TransactionIsolationLevel;

import javax.sql.DataSource;

/**
 * @author hailang.zhang
 * @since 2024-03-31
 */
public class JdbcTransactionFactory implements TransactionFactory {

    @Override
    public Transaction newTransaction(DataSource dataSource, TransactionIsolationLevel level, boolean autoCommit) {
        return null;
    }
}