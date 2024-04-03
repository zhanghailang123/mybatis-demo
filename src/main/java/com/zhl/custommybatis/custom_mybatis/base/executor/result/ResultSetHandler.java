package com.zhl.custommybatis.custom_mybatis.base.executor.result;

import java.sql.Statement;
import java.util.List;

/**
 * @author hailang.zhang
 * @since 2024-04-03
 */
public interface ResultSetHandler {

    <E> List<E> handleResultSets(Statement stmt);
}
