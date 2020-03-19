package com.example.springbootmockmvc.service;

import com.example.springbootmockmvc.common.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author gzy
 * @date 2020/3/18 22:41
 */
@Slf4j
public class UserServiceTest extends BaseTest {
    @Autowired
    private UserBeanService userBeanService;

    @Override
    @Test
    public void test() {
        log.info("----------------------service test");
    }
}
