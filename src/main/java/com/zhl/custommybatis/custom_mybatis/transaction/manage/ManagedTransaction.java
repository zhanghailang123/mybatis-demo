package com.zhl.custommybatis.custom_mybatis.transaction.manage;

import com.zhl.custommybatis.custom_mybatis.transaction.Transaction;

import java.sql.Connection;

/**
 * @author hailang.zhang
 * @since 2024-04-01
 */
public class ManagedTransaction implements Transaction {

    @Override
    public Connection getConnection() {
        return null;
    }
}