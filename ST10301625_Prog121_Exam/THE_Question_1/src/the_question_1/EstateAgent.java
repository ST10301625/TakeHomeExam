/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package the_question_1;


class EstateAgent implements IEstateAgent { 

    @Override
    public double EstateAgentSales(double[] propertySales) {
       
        return 0;   
    }
    
 //Calculating the total sales for John during their 3 months
  public double johnBloggsTotalSales(double[][] propertySales) {
        double johnSum = 0;

        for (int i = 0; i < propertySales.length; i++) {
            for (int j = 0; j < 3; j++) {
                johnSum += propertySales[i][j];
            }
        }

        return johnSum;
    }
//Calculating the total sales for Jane during their 3 months
    public double janeDoeTotalSales(double[][] propertySales) {
        double janeSum = 0;

        for (int i = 0; i < propertySales.length; i++) {
            for (int j = 3; j < 6; j++) {
                janeSum += propertySales[i][j];
            }
        }

        return janeSum;
    }
    
    
    @Override
    // Calculating the commisiion for the estate agents
    public double EstateAgentCommission(double propertySales) {
        return 0.02 * propertySales; // Calculating a very low 2% commission
    }

    @Override
    //Check to see who is the top performing agent between John and Jane
    public int TopEstateAgent(double[] totalSales) {
    int topAgentIndex = 0;
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > totalSales[topAgentIndex]) {
                topAgentIndex = i;
            }
        }
        return topAgentIndex;    
    }
}

    
 
 
  

