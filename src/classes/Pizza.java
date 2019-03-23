/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Zé Maria Valentim
 */
public class Pizza {
    
    private Double size;
    private String crust;
    private String sauce;
    private String topping1;
    private String topping2;
    
    public Pizza(){
        
    }
    
    public Pizza(Double size, String crust, String sauce, String topping1, String topping2){
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.topping1 = topping1;
        this.topping2= topping2;
    }
    
    
    
    public String getCrust() {
        return crust;
    }

    public Double getSize() {
        return size;
    }

    public String getTopping1() {
        return topping1;
    }

    public String getTopping2() {
        return topping2;
    }

    public String getSauce() {
        return sauce;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public void setTopping1(String topping1) {
        this.topping1 = topping1;
    }

    public void setTopping2(String topping2) {
        this.topping2 = topping2;
    }
    
    
    
}
