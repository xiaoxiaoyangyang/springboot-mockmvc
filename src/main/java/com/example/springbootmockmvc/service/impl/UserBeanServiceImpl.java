package com.example.springbootmockmvc.service.impl;

import com.example.springbootmockmvc.entity.UserBean;
import com.example.springbootmockmvc.mapper.UserBeanMapper;
import com.example.springbootmockmvc.service.UserBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author gzy
 * @date 2020/3/18 22:51
 */
@Service
public class UserBeanServiceImpl implements UserBeanService {
    @Autowired
    private UserBeanMapper userBeanMapper;
    @Override
    public UserBean selectOne(Integer id) {
        return userBeanMapper.selectOne(id);
    }
}
