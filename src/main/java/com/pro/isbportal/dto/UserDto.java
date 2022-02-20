package com.pro.isbportal.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String userId;
    private String userPassword;
    private String name;

    public UserDto(Long id, String userId, String userPassword, String name) {
        this.id = id;
        this.userId = userId;
        this.userPassword = userPassword;
        this.name = name;
    }
}
