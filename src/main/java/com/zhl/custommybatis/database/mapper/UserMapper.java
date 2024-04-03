package com.zhl.custommybatis.database.mapper;

import com.zhl.custommybatis.database.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author hailang.zhang
 * @since 2024-04-01
 */
@Repository
public interface UserMapper {

    User selectById(Integer id);
}
