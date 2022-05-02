package com.pro.isbportal.service;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.pro.isbportal.dto.LoginDto;
import com.pro.isbportal.dto.UserDto;
import com.pro.isbportal.mapper.MainMapper;
import com.pro.isbportal.util.AES256;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Service
@Slf4j
public class MainService {

    private final MainMapper mainMapper;
    private AES256 aes256 = new AES256();
    /**
     * 포탈 간편 회원가입
     * @param userDto
     * @return
     */
    public int simpleJoinUser(UserDto userDto) {
        log.info("###### 패스워드 암호화 적용 #######");
        String pass = userDto.getUserPassword();

        try {
            String cipherText = aes256.encrypt(pass);
            userDto.setUserPassword(cipherText);
            log.info("### 암호화된 패스워드 : {}", cipherText);
        } catch (Exception e) {
            e.printStackTrace();
        }

        log.info("### 회원가입 처리");
        return mainMapper.simpleJoinUser(userDto);
    }


    public String simpleLogin(LoginDto loginDto) {
        log.info("###### 로그인 서비스 시작 ######");

        String pass = loginDto.getPassword();
        try {
            String cipherText = aes256.encrypt(pass);
            loginDto.setPassword(cipherText);
            log.info("### 암호화된 패스워드 : {}", cipherText);
        } catch (Exception e) {
            e.printStackTrace();
        }

        log.info("###### 로그인 처리");

        return mainMapper.simpleLoginUser(loginDto);
    }

}
