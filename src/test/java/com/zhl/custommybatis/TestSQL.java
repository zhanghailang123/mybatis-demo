package com.zhl.custommybatis;

import com.zhl.custommybatis.database.cramapper.ICraDao;
import com.zhl.custommybatis.database.mapper.UserMapper;
import com.zhl.custommybatis.database.model.RemiCraClaimInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author hailang.zhang
 * @since 2024-04-01
 */
@SpringBootTest(classes = CustomMybatisApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSQL {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ICraDao iCraDao;

    @Test
    public void test() {
        System.out.println(userMapper.selectById(1));
    }

    @Test
    public void testCra() {
        RemiCraClaimInfo param = new RemiCraClaimInfo();
        iCraDao.findRemiCraCilaiInfoCount(param);
        System.out.println("test cra success");
    }
}