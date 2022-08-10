package com.allstate.directclaimsserver.control;

import com.allstate.directclaimsserver.domain.ClaimsTransaction;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class ClaimsController {

    @GetMapping("/api/direct-claims-server")
    public List<ClaimsTransaction> getAll() {
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
}
