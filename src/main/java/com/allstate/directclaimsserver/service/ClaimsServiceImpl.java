package com.allstate.directclaimsserver.service;

import com.allstate.directclaimsserver.data.ClaimsRepository;
import com.allstate.directclaimsserver.domain.ClaimsTransaction;
import com.allstate.directclaimsserver.dtos.ClaimsTransactionDTO;
import com.allstate.directclaimsserver.exceptions.TransactionNotFoundException;
import com.allstate.directclaimsserver.exceptions.InvalidNewTransactionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.*;

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

    @Override
    public ClaimsTransaction updateTransaction(Integer id, Map<String, String> data) {
        ClaimsTransaction transaction = getTransactionById(id);
        if (data.containsKey("policyNumber")) transaction.setPolicyNumber(data.get("policyNumber"));
        if (data.containsKey("customer")) transaction.setCustomer(data.get("customer"));
        if (data.containsKey("status")) transaction.setStatus(data.get("status"));
        if (data.containsKey("type")) transaction.setType(data.get("type"));
        if (data.containsKey("address")) transaction.setAddress(data.get("address"));
        if (data.containsKey("estimatedValue")) transaction.setEstimatedValue(Integer.parseInt(data.get("estimatedValue")));
        if (data.containsKey("dateOfClaim")) transaction.setDateOfClaim(LocalDate.parse(data.get("dateOfClaim")));
        if (data.containsKey("reason")) transaction.setReason(data.get("reason"));
        if (data.containsKey("incidentDescription")) transaction.setReason(data.get("incidentDescription"));
        if (data.containsKey("addressImpacted")) transaction.setReason(data.get("addressImpacted"));
        if (data.containsKey("motorMake")) transaction.setReason(data.get("motorMake"));
        if (data.containsKey("motorModel")) transaction.setReason(data.get("motorModel"));
        if (data.containsKey("motorYear")) transaction.setReason(data.get("motorYear"));
        if (data.containsKey("petType")) transaction.setReason(data.get("petType"));
        if (data.containsKey("petBreed")) transaction.setReason(data.get("petBreed"));

        return claimsRespository.save(transaction);
    }

    @Override
    public ClaimsTransaction add(ClaimsTransactionDTO transactionDTO) {
        ClaimsTransaction transaction = transactionDTO.toClaimsTransaction();
        
        try {
            return claimsRespository.save(transaction);
        }
        catch (Exception e) {
            throw new InvalidNewTransactionException("We were unable to save your transaction");
        }
    }

}
