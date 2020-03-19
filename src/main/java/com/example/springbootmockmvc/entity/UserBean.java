package com.example.springbootmockmvc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author gzy
 * @date 2020/3/18 22:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBean {
    private Integer id;
    private String name;
    private Integer age;
    private String email;
}
