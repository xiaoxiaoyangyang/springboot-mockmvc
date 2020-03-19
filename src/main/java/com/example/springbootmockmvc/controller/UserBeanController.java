package com.example.springbootmockmvc.controller;

import com.example.springbootmockmvc.common.CommonResponse;
import com.example.springbootmockmvc.entity.UserBean;
import com.example.springbootmockmvc.service.UserBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gzy
 * @date 2020/3/18 22:52
 */
@RestController
public class UserBeanController {
    @Autowired
    private UserBeanService userBeanService;

    @GetMapping("/selectOne")
    public CommonResponse selectOne(Integer id){
        return new CommonResponse<UserBean>()
                .setStatus("200")
                .setData(userBeanService.selectOne(id));
    }
}
