package com.cwj.cwjpicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -556330649525361901L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
