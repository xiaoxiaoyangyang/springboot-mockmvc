package com.example.springbootmockmvc;

import com.example.springbootmockmvc.controller.UserBeanController;
import net.bytebuddy.asm.Advice;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootMockmvcApplicationTests {

    @Autowired
    private UserBeanController userBeanController;
    @Test
    public void contextLoads() {
        System.out.println(userBeanController.selectOne(1));
    }

}
