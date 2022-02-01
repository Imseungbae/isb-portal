package com.pro.isbportal.service;

import com.pro.isbportal.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestMapper testMapper;

    public String selectUserInfo() {
        return testMapper.selectUserInfo();
    }
}
