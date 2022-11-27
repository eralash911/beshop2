package com.shein.beshop.repository;

import com.shein.beshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findFirstByName(String name);

}
