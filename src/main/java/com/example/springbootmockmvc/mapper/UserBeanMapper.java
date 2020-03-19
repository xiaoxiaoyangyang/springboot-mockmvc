package com.example.springbootmockmvc.mapper;

import com.example.springbootmockmvc.entity.UserBean;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author gzy
 * @date 2020/3/18 22:48
 */
@Mapper
public interface UserBeanMapper
{
    UserBean selectOne(Integer id);
}
