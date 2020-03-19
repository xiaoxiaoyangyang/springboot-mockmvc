package com.example.springbootmockmvc.service;

import com.example.springbootmockmvc.entity.UserBean;

/**
 * @author gzy
 * @date 2020/3/18 22:51
 */
public interface UserBeanService {
    UserBean selectOne(Integer id);
}
