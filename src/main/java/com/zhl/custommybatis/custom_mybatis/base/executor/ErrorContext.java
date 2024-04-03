package com.zhl.custommybatis.custom_mybatis.base.executor;

/**
 * @author hailang.zhang
 * @since 2024-04-02
 */
public class ErrorContext {

    private static final ThreadLocal<ErrorContext> LOCAL = ThreadLocal.withInitial(ErrorContext::new);
    private ErrorContext stored;
    private String source;
    private String activity;
    private String object;
    private String message;
    private String sql;
    private Throwable cause;

    public ErrorContext() {
    }

    public static ErrorContext instance() {
        return LOCAL.get();
    }

    public ErrorContext store() {
        ErrorContext newContext = new ErrorContext();
        newContext.stored = this;
        LOCAL.set(newContext);
        return LOCAL.get();
    }

    public ErrorContext resource(String resource) {
        this.source = resource;
        return this;
    }

    public ErrorContext activity(String activity) {
        this.activity = activity;
        return this;
    }

    public ErrorContext message(String message) {
        this.message = message;
        return this;
    }

    public ErrorContext sql(String sql) {
        this.sql = sql;
        return this;
    }

    public ErrorContext cause(Throwable cause) {
        this.cause = cause;
        return this;
    }
}