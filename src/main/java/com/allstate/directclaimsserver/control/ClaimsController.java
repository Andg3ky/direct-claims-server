package com.allstate.directclaimsserver.control;

import com.allstate.directclaimsserver.domain.ClaimsTransaction;
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

    @GetMapping("/volume")
    public Map<String, String> getNumberofClaims() {
        Integer volume = claimsService.countTransactions();
        Map<String, String> results = new HashMap<>();
        results.put("volume", volume.toString());
        return results;
    }
}
