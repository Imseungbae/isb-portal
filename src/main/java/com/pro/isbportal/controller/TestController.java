package com.pro.isbportal.controller;

import com.pro.isbportal.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/isb-portal")
@Slf4j
public class TestController {
    private final TestService testService;

    @GetMapping("/test")
    public String test(HttpServletRequest request) {
        log.debug("request: ", request);
        return testService.selectUserInfo();
    }
}
