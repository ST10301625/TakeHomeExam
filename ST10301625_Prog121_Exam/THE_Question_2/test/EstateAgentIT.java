/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author totca
 */
public class EstateAgentIT {
    
    
    @Test
    public void testValidateData() {
        System.out.println("validateData");
        Data dataToValidate = null;
        EstateAgent instance = new EstateAgent();
        boolean expResult = false;
        boolean result = instance.validateData(dataToValidate);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateCommission method, of class EstateAgent.
     */
    @Test
    public void testCalculateCommission() {
        System.out.println("calculateCommission");
        String Property_Price = "2500000";
        String Commission = "15";
        EstateAgent instance = new EstateAgent();
        double expResult = 375000;
        double result = instance.calculateCommission(Property_Price, Commission);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }
    
}
