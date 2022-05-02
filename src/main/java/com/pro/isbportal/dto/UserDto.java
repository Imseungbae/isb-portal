package com.pro.isbportal.dto;

import lombok.Data;

@Data
public class UserDto {
    private String userId;
    private String userPassword;
    private String name;

    public UserDto(String userId, String userPassword, String name) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.name = name;
    }
}
