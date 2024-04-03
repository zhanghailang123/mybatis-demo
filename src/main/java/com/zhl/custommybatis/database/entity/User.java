package com.zhl.custommybatis.database.entity;

import lombok.Data;

/**
 * @author hailang.zhang
 * @since 2024-04-01
 */
@Data
public class User {

    private Integer id;

    private String userName;

    private Integer age;

    private Integer gender;
}