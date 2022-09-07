package com.allstate.directclaimsserver.unittests;

import com.allstate.directclaimsserver.domain.ClaimsTransaction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DomainClassTests {

    @Test
    public void testEqualityForClaimsTransaction() {
        //GIVEN we have 2 transactions
        ClaimsTransaction transaction1 = new ClaimsTransaction();
        ClaimsTransaction transaction2 = new ClaimsTransaction();

        //WHEN both transactions have the same ID
        transaction1.setId(123);
        transaction2.setId(123);

        //THEN the transactions should be equal
        assertEquals(transaction1, transaction2);
        //assertTrue(transaction1.equals(transaction2));

    }
}
