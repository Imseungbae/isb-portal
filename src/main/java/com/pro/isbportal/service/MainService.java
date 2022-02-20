package com.pro.isbportal.service;

import com.pro.isbportal.dto.UserDto;
import com.pro.isbportal.mapper.MainMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class MainService {

    private final MainMapper mainMapper;

    /**
     * 포탈 간편 회원가입
     * @param userDto
     * @return
     */
    public int simpleJoinUser(UserDto userDto) {
        log.info("#############");
        log.info("user : {}", userDto);
        log.info("#############");
        return mainMapper.simpleJoinUser(userDto);
    }

}
