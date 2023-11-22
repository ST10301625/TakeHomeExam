/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package the_question_1;

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
    public void testEstateAgentSales() {
        System.out.println("EstateAgentSales");
        double[] propertySales = null;
        EstateAgent instance = new EstateAgent();
        double expResult = 0.0;
        double result = instance.EstateAgentSales(propertySales);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of johnBloggsTotalSales method, of class EstateAgent.
     */
    @Test
    public void testJohnBloggsTotalSales() {
        System.out.println("johnBloggsTotalSales");
        double[][] propertySales = null;
        EstateAgent instance = new EstateAgent();
        double expResult = 4300000.0;
        double result = instance.johnBloggsTotalSales(propertySales);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of janeDoeTotalSales method, of class EstateAgent.
     */
    @Test
    public void testJaneDoeTotalSales() {
        System.out.println("janeDoeTotalSales");
        double[][] propertySales = null;
        EstateAgent instance = new EstateAgent();
        double expResult = 3500000.0;
        double result = instance.janeDoeTotalSales(propertySales);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of EstateAgentCommission method, of class EstateAgent.
     */
    @Test
    public void testEstateAgentCommission() {
        System.out.println("EstateAgentCommission");
        double propertySales = 0.0;
        EstateAgent instance = new EstateAgent();
        double expResult = 86000.00;
        double result = instance.EstateAgentCommission(propertySales);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of TopEstateAgent method, of class EstateAgent.
     */
    @Test
    public void testTopEstateAgent() {
        System.out.println("TopEstateAgent");
        double[] totalSales = null;
        EstateAgent instance = new EstateAgent();
        String expResult = "John Bloggs" ;
        int result = instance.TopEstateAgent(totalSales);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
