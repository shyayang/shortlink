package com.nageoffer.shortlink.admin.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* 用户登录接口返回参数
* */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginRespDTO {

    /*
    * 用户Token
    * */
    private String token;
}
