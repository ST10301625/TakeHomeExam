/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author totca
 */
class EstateAgent implements IEstateAgent{ 
    
    

    @Override
    public boolean validateData(Data dataToValidate) {
        
        return isNotEmpty(dataToValidate.getProperty_Location()) &&
                isNotEmpty(dataToValidate.get_AgentName()) &&
                isGreaterThanZero(dataToValidate.get_PropertyPrice()) &&
                isGreaterThanZero(dataToValidate.get_AgentCommission());
    }

    private boolean isNotEmpty(String value) {
        return value != null && !value.isEmpty();
    }

    private boolean isGreaterThanZero(String value) {
        try {
            double numericValue = Double.parseDouble(value);
            return numericValue > 0;
        } catch (NumberFormatException e) {
            return false; //
        }
    }

    
    @Override
    public double calculateCommission(String Property_Price, String Commission) {
    double price = Double.parseDouble(Property_Price);
        double commission = Double.parseDouble(Commission);

        return price * commission / 100.0;    
    }

 

    
}
