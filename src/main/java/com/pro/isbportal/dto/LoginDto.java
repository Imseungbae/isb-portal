package com.pro.isbportal.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class LoginDto {

    private String id;
    private String password;

    public LoginDto() {

    }

    public LoginDto(String id, String password) {
        this.id = id;
        this.password = password;
    }
}
