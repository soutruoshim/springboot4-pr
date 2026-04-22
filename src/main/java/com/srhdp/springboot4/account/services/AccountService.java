package com.srhdp.springboot4.account.services;

import com.srhdp.springboot4.account.dtos.AccountDTO;
import com.srhdp.springboot4.account.entity.Account;
import com.srhdp.springboot4.auth_users.entity.User;
import com.srhdp.springboot4.enums.AccountType;
import com.srhdp.springboot4.res.Response;

import java.util.List;

public interface AccountService {
    Account createAccount(AccountType accountType, User user);

    Response<List<AccountDTO>> getMyAccounts();

    Response<?> closeAccount(String accountNumber);
}

