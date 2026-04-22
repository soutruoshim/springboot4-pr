package com.srhdp.springboot4.audit_dashboard.services;


import com.srhdp.springboot4.account.dtos.AccountDTO;
import com.srhdp.springboot4.auth_users.dtos.UserDTO;
import com.srhdp.springboot4.transaction.dtos.TransactionDTO;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface AuditorService {

    Map<String, Long> getSystemTotals();

    Optional<UserDTO> findUserByEmail(String email);

    Optional<AccountDTO> findAccountDetailsByAccountNumber(String accountNumber);

    List<TransactionDTO> findTransactionsByAccountNumber(String accountNumber);

    Optional<TransactionDTO> findTransactionById(Long transactionId);
}
