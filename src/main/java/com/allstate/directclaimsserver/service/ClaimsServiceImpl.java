package com.allstate.directclaimsserver.service;

import com.allstate.directclaimsserver.data.ClaimsRepository;
import com.allstate.directclaimsserver.domain.ClaimsTransaction;
import com.allstate.directclaimsserver.exceptions.TransactionNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ClaimsServiceImpl implements ClaimsService {

    @Autowired
    private ClaimsRepository claimsRespository;

    Logger logger = LoggerFactory.getLogger(ClaimsService.class);

    @Override
    public List<ClaimsTransaction> getAllTransactions() {
        return claimsRespository.findAll();
    }

    //@Override
    //public ClaimsTransaction getTransactionById(Integer id) {
    //    return (ClaimsTransaction) claimsRespository.findAllById(Collections.singleton(id));
    //}

    @Override
    public ClaimsTransaction getTransactionById(Integer id) {
        Optional<ClaimsTransaction> optionalCT =  claimsRespository.findById(id);
        if (optionalCT.isPresent()) {
            return optionalCT.get();
        }
        logger.info("There is no transaction with an ID of " + id);
        throw new TransactionNotFoundException("There is no transaction with an ID of " + id);
    }

    @Override
    public int countTransactions() {
        return claimsRespository.findAll().size();
    }

}
