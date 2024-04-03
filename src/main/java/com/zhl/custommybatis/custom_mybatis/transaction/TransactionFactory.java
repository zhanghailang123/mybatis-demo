package com.zhl.custommybatis.custom_mybatis.transaction;

import javax.sql.DataSource;

/**
 * @author hailang.zhang
 * @since 2024-03-31
 */
public interface TransactionFactory {

    Transaction newTransaction(DataSource dataSource, TransactionIsolationLevel level, boolean autoCommit);
}