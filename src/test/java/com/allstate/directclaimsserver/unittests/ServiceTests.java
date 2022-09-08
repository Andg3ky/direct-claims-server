package com.allstate.directclaimsserver.unittests;

import com.allstate.directclaimsserver.data.ClaimsRepository;
import com.allstate.directclaimsserver.domain.ClaimsTransaction;
import com.allstate.directclaimsserver.service.ClaimsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
public class ServiceTests {

    /*
    Testing that countTransactions method of the service class is counting the right number.
    Mocking up the repository
     */
    //Class we are testing
    @Autowired
    ClaimsService claimsService;

    @MockBean
    ClaimsRepository claimsRepository;

    @Test
    public void testNumberOfTransactions() {
        List<ClaimsTransaction> transactions = new ArrayList<>();
        transactions.add(new ClaimsTransaction(1, "934567229", "Mrs Jennifer Campbell", "In Progress", "Property", "66 Main Road",
                300, LocalDate.now(), "Flood Damage", "Storm", "Same as Customer Address", "Not Applicable", "Not Applicable", 0,
                "Not Applicable", "Not Applicable"));
        transactions.add(new ClaimsTransaction(2, "946682340", "Mr Andrew Scott", "Awaiting Assessment", "Auto", "76 Beach Street",
                498, LocalDate.now(), "Car Accident", "Crashed into another car", "Same as Customer Address", "Mercedes", "Benz", 2020,
                "Not Applicable", "Not Applicable"));
        transactions.add(new ClaimsTransaction(3, "946798342", "Miss Jane Bailey", "Transferred to Main Claims", "Pet", "19 Lanyon Drive",
                180, LocalDate.now(), "Pet Injured", "Jumping on Tree", "Not Applicable", "Not Applicable", "Not Applicable", 0,
                "Cat", "Persian"));

        Mockito.when(claimsRepository.findAll()).thenReturn(transactions);

        int result = claimsService.countTransactions();
        assertEquals(3, result);
    }
}
