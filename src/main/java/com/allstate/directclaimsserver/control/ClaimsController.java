package com.allstate.directclaimsserver.control;

import com.allstate.directclaimsserver.domain.ClaimsTransaction;
import com.allstate.directclaimsserver.dtos.ClaimsTransactionDTO;
import com.allstate.directclaimsserver.service.ClaimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api/direct-claims-server")
public class ClaimsController {

    @Autowired
    ClaimsService claimsService;

    //Get all transaction data
    @GetMapping()
    public List<ClaimsTransaction> getAll() {
        return claimsService.getAllTransactions();
    }

    @GetMapping(value ="/{id}", produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ClaimsTransaction getById(@PathVariable("id") Integer id) {
        return claimsService.getTransactionById(id);
    }

    @GetMapping("/volume")
    public Map<String, String> getNumberofClaims() {
        Integer volume = claimsService.countTransactions();
        Map<String, String> results = new HashMap<>();
        results.put("volume", volume.toString());
        return results;
    }

    @PutMapping("/{id}")
    public ClaimsTransaction updateTransaction(@PathVariable("id") Integer id,
                                               @RequestBody Map<String, String> data) {

        return claimsService.updateTransaction(id, data);
    }

    @PostMapping
    public ClaimsTransaction addTransaction(@RequestBody ClaimsTransactionDTO newTransaction) {
        return claimsService.add(newTransaction);
    }

}
