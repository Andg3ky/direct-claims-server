package com.allstate.directclaimsserver.control;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HealthController {

    @GetMapping("/api/health")
    public String healthcheck() {

        return "testing direct-claims-server health check is ok";
    }
}
