package com.pro.isbportal.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/isb")
public class MainController {

    /**
     * 포탈 회원가입
     * @param request - 가입정보
     * @param body
     * @return
     */
    @PostMapping("/user")
    public String saveUser(HttpServletRequest request, @RequestBody Map<String, Object> body) {
        return "success";
    }
}
