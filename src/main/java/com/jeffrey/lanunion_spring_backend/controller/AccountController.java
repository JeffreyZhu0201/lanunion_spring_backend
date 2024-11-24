package com.jeffrey.lanunion_spring_backend.controller;

import com.jeffrey.lanunion_spring_backend.common.Result;
import com.jeffrey.lanunion_spring_backend.entity.Account;
import com.jeffrey.lanunion_spring_backend.service.AccountService;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    AccountService accountService;

    @PostMapping("/login")
    public Result login(@RequestBody Account account, @Param("role") String role) {
        return accountService.login(role, account);
    }

    @PostMapping("/register")
    public Result register(@RequestBody Account account, @Param("role") String role) {
        return accountService.register(role,account);
    }

    @GetMapping("/get")
    public Result getAccount(@RequestBody Account account, @Param("role") String role) {
        return accountService.getAccount(role,account);
    }


}
