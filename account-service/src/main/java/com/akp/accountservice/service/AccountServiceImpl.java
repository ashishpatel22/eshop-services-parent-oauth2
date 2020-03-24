package com.akp.accountservice.service;

import org.springframework.stereotype.Service;

import com.akp.accountservice.client.AuthServiceFeignClient;
import com.akp.accountservice.dto.UserDto;
import com.akp.accountservice.dto.UserRegistrationDto;

@Service
public class AccountServiceImpl implements AccountService {

    private final AuthServiceFeignClient authServiceFeignClient;

    public AccountServiceImpl(AuthServiceFeignClient authServiceFeignClient) {
        this.authServiceFeignClient = authServiceFeignClient;
    }

    @Override
    public UserDto create(UserRegistrationDto user) {
        return authServiceFeignClient.createUser(user);
    }
}
