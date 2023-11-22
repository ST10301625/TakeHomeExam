/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author totca
 */
public class Data {
    String location;
    String name;
    String price;
    String commission;  

    Data(String location, String name, Double price, Double commission) {
    this.location = location;
    this.name = name;
    this.price = Double.toString(price);
    this.commission = Double.toString(commission);

    }

    public String getProperty_Location() {
        return location;
    }

    public String get_AgentName() {
        return name;
    }

    public String get_PropertyPrice() {
        return price;
    }

    public String get_AgentCommission() {
        return commission;
    }
}

    

