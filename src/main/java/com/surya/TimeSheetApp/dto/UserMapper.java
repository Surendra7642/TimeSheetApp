package com.surya.TimeSheetApp.dto;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.surya.TimeSheetApp.entity.Role;
import com.surya.TimeSheetApp.entity.User;

@Component
public class UserMapper {


    /*    @Autowired
        PasswordEncoder passwordEncoder;*/
    public UserDto toDto(User user)
    {
        UserDto userDto=new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstname(user.getName().split(" ")[0]);
        userDto.setLastname(user.getName().split(" ")[1]);
        userDto.setEmail(user.getEmail());
        userDto.setPassword("");//passwordEncoder.encode(user.getPassword()));
        List<String> roles=new ArrayList<>();
        for (Role role:user.getRoles()) {
            roles.add(role.getName());
        }
        userDto.setRoles(roles);
        return userDto;
    }

    public User toEntity(UserDto userDto)
    {
        User user=new User();
        user.setId(userDto.getId());
        user.setName(userDto.getFirstname()+" "+userDto.getLastname());
        user.setEmail(userDto.getEmail());
        user.setPassword( "admin123");//passwordEncoder.encode(userDto.getPassword()));
        return user;
    }
}
