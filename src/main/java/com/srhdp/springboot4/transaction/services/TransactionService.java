package com.srhdp.springboot4.transaction.services;

import com.srhdp.springboot4.res.Response;
import com.srhdp.springboot4.transaction.dtos.TransactionDTO;
import com.srhdp.springboot4.transaction.dtos.TransactionRequest;

import java.util.List;

public interface TransactionService {
    Response<?> createTransaction(TransactionRequest transactionRequest);
    Response<List<TransactionDTO>> getTransactionsForMyAccount(String accountNumber, int page, int size);
}
