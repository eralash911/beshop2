package com.shein.beshop.service;

import com.shein.beshop.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    boolean save(UserDto userDto);
    List<UserDto>getAll();
}
