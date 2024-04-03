package com.zhl.custommybatis;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author hailang.zhang
 * @since 2024-04-02
 */
@SpringBootTest
public class TestNoSpringMain {

    @Test
    public void testMain() {
        System.out.println(111 + System.lineSeparator().toString() + 222);
    }
}