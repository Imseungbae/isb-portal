package com.pro.isbportal.controller;

import com.pro.isbportal.dto.UserDto;
import com.pro.isbportal.service.MainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Map;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/isb")
public class MainController {

    private final MainService mainService;

    /**
     * 포탈 간편 회원가입
     * @param request - 가입정보
     * @param body
     * @return
     */
    @PostMapping("/user")
    public int simpleJoinUser(HttpServletRequest request, @RequestBody Map<String, Object> body) {
        Enumeration headerNames = request.getHeaderNames();

        long id = 1L;
        String userId = (String) body.get("id");
        String userPw = (String) body.get("password");
        String name = (String) body.get("name");

        UserDto userDto = new UserDto(id, userId, userPw, name);

        return mainService.simpleJoinUser(userDto);
    }
}
