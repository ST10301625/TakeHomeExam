/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package the_question_1;

/**
 *
 * @author totca
 */
public class THE_Question_1 {

   
    public static void main(String[] args) {
       
// https://www.youtube.com/watch?v=L3-q2GxAqZA
// Working with 2D arrays.

        double arrPropertySales[][] = {
                {800000, 1500000, 2000000,  // John Bloggs' sales for Jan, Feb, Mar
                 700000, 1200000, 1600000}, // Jane Doe's sales for Jan, Feb, Mar
        };
        
        EstateAgent ea = new EstateAgent();

        // Calculate and print total property sales for John Bloggs
        double johnTotalSales = ea.johnBloggsTotalSales(arrPropertySales);
        System.out.println("John Bloggs' Total Sales (Jan + Feb + Mar): $" + johnTotalSales);

        // Calculate and print commission for John Bloggs
        double johnCommission = ea.EstateAgentCommission(johnTotalSales);
        System.out.println("John Bloggs' Commission: $" + johnCommission + "\n");

        // Calculate and print total property sales for Jane Doe
        double janeTotalSales = arrPropertySales[0][3] + arrPropertySales[0][4] + arrPropertySales[0][5];
        System.out.println("Jane Doe's Total Sales (Jan + Feb + Mar): $" + janeTotalSales);

        // Calculate and print commission for Jane Doe
        double janeCommission = ea.EstateAgentCommission(janeTotalSales);
        System.out.println("Jane Doe's Commission: $" + janeCommission + "\n");

        // Determine and print the top-performing agent
        double[] totalSales = {johnTotalSales, janeTotalSales};
        int topAgentIndex = ea.TopEstateAgent(totalSales);
        String topAgent = (topAgentIndex == 0) ? "John Bloggs" : "Jane Doe";
        System.out.println("Top Performing Agent: " + topAgent);
    }
}




