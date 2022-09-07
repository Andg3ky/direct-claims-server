package com.allstate.directclaimsserver.unittests;

import com.allstate.directclaimsserver.control.ClaimsController;
import com.allstate.directclaimsserver.service.ClaimsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

//3 annotations required in test class for dependency injection, inversion of control (IOC)
@SpringBootTest
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
public class ControllerTests {

    //Spring will give the controller for instantiation
    @Autowired
    ClaimsController claimsController;

    //This creates an implementation of the service
    @MockBean
    ClaimsService claimsService;

    //Issue of controller talking to service talking to database (and) dependency
    //Simulate the service without the database
    @Test
    public void checkThatNumberOfTransactionsIsAMapWithAKeyOfVolume() {
        //ClaimsController claimsController = new ClaimsController(); - now set above

        claimsController.getNumberofClaims();
    }


}
