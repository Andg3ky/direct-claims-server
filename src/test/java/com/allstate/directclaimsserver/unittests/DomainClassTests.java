package com.allstate.directclaimsserver.unittests;

import com.allstate.directclaimsserver.domain.ClaimsTransaction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DomainClassTests {

    @Test
    public void testStatusEqualityForClaimsTransaction() {
        //GIVEN we have 2 transactions
        ClaimsTransaction transaction1 = new ClaimsTransaction();
        ClaimsTransaction transaction6 = new ClaimsTransaction();

        //WHEN 2 transactions have the same Status
        transaction1.setStatus("Awaiting Payment");
        transaction6.setStatus("Awaiting Payment");

        //THEN the transactions should be equal
        assertEquals(transaction1, transaction6);
    }

    @Test
    public void testStatusNonEqualityForClaimsTransaction() {
        //GIVEN we have 2 transactions
        ClaimsTransaction transaction3 = new ClaimsTransaction();
        ClaimsTransaction transaction9 = new ClaimsTransaction();

        //WHEN 2 transactions have the different IDs
        transaction3.setId(123);
        transaction9.setId(456);

        //THEN the transactions should be equal
        assertNotEquals(transaction3, transaction9);
    }
}
