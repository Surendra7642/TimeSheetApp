package com.surya.TimeSheetApp.service;
import org.springframework.stereotype.Service;

import com.surya.TimeSheetApp.dto.UserDto;

import java.util.List;

@Service
public interface UserService {

    List<UserDto> findAllUsers();

    UserDto findUserByEmail(String email);

    UserDto saveUser(UserDto userDto);

    UserDto findUserByName(String userName);
    //public boolean forgotPwd(String email);

    public boolean forgotPwd(String email) ;
}
