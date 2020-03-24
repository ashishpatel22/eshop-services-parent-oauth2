package com.akp.accountservice.service;

import com.akp.accountservice.dto.UserDto;
import com.akp.accountservice.dto.UserRegistrationDto;

public interface AccountService {

    /**
     * Invokes Auth Service user creation
     *
     * @param user
     * @return created account
     */
    UserDto create(UserRegistrationDto user);
}
