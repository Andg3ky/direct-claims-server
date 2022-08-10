package com.allstate.directclaimsserver.service;

import com.allstate.directclaimsserver.data.ClaimsRepository;
import com.allstate.directclaimsserver.domain.ClaimsTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClaimsServiceImpl implements ClaimsService {

    @Autowired
    private ClaimsRepository claimsRespository;

    @Override
    public List<ClaimsTransaction> getAllTransactions() {
        ClaimsTransaction claims1 = new ClaimsTransaction(101, 923880431, "Mr Alan James", "Awaiting Assessment",
                "Property", "1 Main Road", 450, LocalDate.now(), "Window Smashed");
        ClaimsTransaction claims2 = new ClaimsTransaction(102, 973621146, "Miss Daisy Harrison", "Rejected",
                "Auto", "29 Grove Hill", 270, LocalDate.now(), "Car Backed Into");
        ClaimsTransaction claims3 = new ClaimsTransaction(103, 900632137, "Mr James Willis", "In Progress",
                "Pet", "15 Green Lane", 100, LocalDate.now(), "Pet Dental Work");
        List<ClaimsTransaction> transactionList= new ArrayList<>();
        transactionList.add(claims1);
        transactionList.add(claims2);
        transactionList.add(claims3);
        return transactionList;
    }

    @Override
    public int countTransactions() {
        return 192;
    }
}
