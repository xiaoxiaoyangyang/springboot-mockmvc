package com.example.springbootmockmvc.dao;

import com.example.springbootmockmvc.common.BaseTest;
import com.example.springbootmockmvc.mapper.UserBeanMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author gzy
 * @date 2020/3/18 22:42
 */
@Slf4j
public class UserDaoTest extends BaseTest {
    @Autowired
    private UserBeanMapper userBeanMapper;

    @Override
    @Test
    public void test() {
        log.info("-----------------mapper test");
    }
}
