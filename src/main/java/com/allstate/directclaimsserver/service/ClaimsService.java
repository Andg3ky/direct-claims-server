package com.allstate.directclaimsserver.service;

import com.allstate.directclaimsserver.domain.ClaimsTransaction;

import java.util.List;

public interface ClaimsService {

    public List<ClaimsTransaction> getAllTransactions();
    public int countTransactions();

}
