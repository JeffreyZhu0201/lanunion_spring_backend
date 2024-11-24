package com.jeffrey.lanunion_spring_backend.service;

import com.jeffrey.lanunion_spring_backend.common.Result;
import com.jeffrey.lanunion_spring_backend.entity.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {

    Result login(String dataBase, Account account);

    Result register(String dataBase, Account account);

    Result getAccount(String dataBase, Account account);

}
