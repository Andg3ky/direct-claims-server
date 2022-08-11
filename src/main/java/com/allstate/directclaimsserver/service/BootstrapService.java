package com.allstate.directclaimsserver.service;

import com.allstate.directclaimsserver.data.ClaimsRepository;
import com.allstate.directclaimsserver.domain.ClaimsTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Service
public class BootstrapService {

    @Autowired
    ClaimsRepository claimsRepository;

    @PostConstruct
    public void initializeDate() {

        if (claimsRepository.findAll().size() ==0) {

            ClaimsTransaction claim1 = new ClaimsTransaction(null, 923880431, "Mr Alan James", "Awaiting Assessment",
                    "Property", "1 Main Road", 450, LocalDate.now(), "Window Smashed");
            ClaimsTransaction claim2 = new ClaimsTransaction(null, 973621146, "Miss Daisy Harrison", "Rejected",
                    "Auto", "29 Grove Hill", 270, LocalDate.now(), "Car Backed Into");
            ClaimsTransaction claim3 = new ClaimsTransaction(null, 900632137, "Mr James Willis", "In Progress",
                    "Pet", "15 Green Lane", 100, LocalDate.now(), "Pet Dental Work");
            ClaimsTransaction claim4 = new ClaimsTransaction(null, 912989853, "Mrs Samantha Burton", "Rejected",
                    "Auto", "60 Burns Gardens", 499, LocalDate.now(), "Car Door Vandalised");
            ClaimsTransaction claim5 = new ClaimsTransaction(null, 934324234, "Mr John Smith", "Awaiting Assessment",
                    "Pet", "5 Main Street", 350, LocalDate.now(), "Pet Leg Injury");
            ClaimsTransaction claim6 = new ClaimsTransaction(null, 923444656, "Mrs Talia Johnson", "Awaiting Payment",
                    "Property", "40 Mayfair Park", 50, LocalDate.now(), "Roof Slates Fallen");
            ClaimsTransaction claim7 = new ClaimsTransaction(null, 980380734, "Mr Michael Cole", "Accepted and Paid",
                    "Property", "50 Warren Drive", 150, LocalDate.now(), "Water Damage");
            ClaimsTransaction claim8 = new ClaimsTransaction(null, 924343889, "Mrs Jane Bailey", "Transferred to Main Claims",
                    "Pet", "18 Parker Avenue", 190, LocalDate.now(), "Pet Illness");
            ClaimsTransaction claim9 = new ClaimsTransaction(null, 975260750, "Mr Grant Stewart", "Accepted and Paid",
                    "Auto", "20 Morrison Lane", 350, LocalDate.now(), "Electrical Fault");
            ClaimsTransaction claim10 = new ClaimsTransaction(null, 977308734, "Miss Libby Graham", "In Progress",
                    "Auto", "61 Beverley Roads", 90, LocalDate.now(), "Mirrors Broken");

            claimsRepository.save(claim1);
            claimsRepository.save(claim2);
            claimsRepository.save(claim3);
            claimsRepository.save(claim4);
            claimsRepository.save(claim5);
            claimsRepository.save(claim6);
            claimsRepository.save(claim7);
            claimsRepository.save(claim8);
            claimsRepository.save(claim9);
            claimsRepository.save(claim10);

        }
    }
}
