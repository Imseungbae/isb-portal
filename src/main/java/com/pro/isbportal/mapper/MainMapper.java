package com.pro.isbportal.mapper;

import com.pro.isbportal.dto.LoginDto;
import com.pro.isbportal.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MainMapper {
    int simpleJoinUser(UserDto userDto);
    String simpleLoginUser(LoginDto loginDto);
}

