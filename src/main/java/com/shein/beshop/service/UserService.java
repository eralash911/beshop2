package com.shein.beshop.service;

import com.shein.beshop.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    boolean save(UserDto userDto);
}
