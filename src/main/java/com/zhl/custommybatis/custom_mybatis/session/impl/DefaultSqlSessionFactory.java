package com.zhl.custommybatis.custom_mybatis.session.impl;

import com.zhl.custommybatis.custom_mybatis.base.executor.Executor;
import com.zhl.custommybatis.custom_mybatis.session.ExecutorType;
import com.zhl.custommybatis.custom_mybatis.session.SqlSession;
import com.zhl.custommybatis.custom_mybatis.session.SqlSessionFactory;
import com.zhl.custommybatis.custom_mybatis.base.Configuration;
import com.zhl.custommybatis.custom_mybatis.transaction.Environment;
import com.zhl.custommybatis.custom_mybatis.transaction.Transaction;
import com.zhl.custommybatis.custom_mybatis.transaction.TransactionFactory;
import com.zhl.custommybatis.custom_mybatis.transaction.TransactionIsolationLevel;
import com.zhl.custommybatis.custom_mybatis.transaction.manage.ManagedTransactionFactory;

/**
 * @author hailang.zhang
 * @since 2024-03-31
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return openSessionFromDataSource(configuration.getDefaultExecutorType(), null, false);
    }

    private SqlSession openSessionFromDataSource(ExecutorType execType, TransactionIsolationLevel level, boolean autoCommit) {
        Environment environment = configuration.getEnvironment();
        TransactionFactory transactionFactory = getTransactionFactoryFromEnvironment(environment);
        Transaction transaction = transactionFactory.newTransaction(environment.getDataSource(), level, autoCommit);
        Executor executor = configuration.newExecutor(transaction, execType);
        return new DefaultSqlSession(configuration, executor, autoCommit);
    }

    private TransactionFactory getTransactionFactoryFromEnvironment(Environment environment) {
        if (environment == null || environment.getTransactionFactory() == null) {
            return new ManagedTransactionFactory();
        }
        return environment.getTransactionFactory();
    }
}