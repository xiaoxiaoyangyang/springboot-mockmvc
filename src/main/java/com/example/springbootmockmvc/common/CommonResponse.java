package com.example.springbootmockmvc.common;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author gzy
 * @date 2020/3/18 22:55
 */
@Data
@Accessors(chain = true)
public class CommonResponse<T> {
    private String status;
    private String errorCode;
    private String msg;
    private T data;
}
