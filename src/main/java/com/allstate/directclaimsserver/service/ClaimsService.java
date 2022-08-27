package com.allstate.directclaimsserver.service;

import com.allstate.directclaimsserver.domain.ClaimsTransaction;
import com.allstate.directclaimsserver.dtos.ClaimsTransactionDTO;

import java.util.List;
import java.util.Map;

public interface ClaimsService {

    public List<ClaimsTransaction> getAllTransactions();
    public int countTransactions();
    ClaimsTransaction getTransactionById(Integer id);
    ClaimsTransaction updateTransaction(Integer id, Map<String,String> data);
    ClaimsTransaction add(ClaimsTransactionDTO transaction);

}
