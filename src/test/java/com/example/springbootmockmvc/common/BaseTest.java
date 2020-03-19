package com.example.springbootmockmvc.common;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author gzy
 * @date 2020/3/18 22:37
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class BaseTest  {

    public abstract void test();

    @Before
    public void startTime(){
        log.info("------------------------执行的开始时间：{}",System.currentTimeMillis());
    }

    @After
    public void endTime(){
        log.info("-----------------------执行的结束时间：{}",System.currentTimeMillis());
    }
}
