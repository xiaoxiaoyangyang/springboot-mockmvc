package com.example.springbootmockmvc.controller;

import com.alibaba.fastjson.JSON;
import com.example.springbootmockmvc.common.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author gzy
 * @date 2020/3/18 22:39
 */
@Slf4j
public class UserControllerTest extends BaseTest {

    protected MockMvc mockMvc;

    @Autowired
    protected WebApplicationContext webApplicationContext;

    @Before
    public void setup(){
        //初始化MockMvc对象
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    @Test
    public void testSelectOne() throws Exception {
        Integer id = 1;
        RequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/selectOne?id=1");
        MvcResult mvcResult = mockMvc.perform(mockHttpServletRequestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
        MockHttpServletResponse response = mvcResult.getResponse();
        log.info("-------------查询到的数据：{}", JSON.toJSONString(response.getContentAsString()));

    }

    @Override
    @Test
    public void test() {
        log.info("--------------------------test controller");
    }
}
