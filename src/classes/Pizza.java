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
    
    private Size size;
    private Crust crust;
    private Sauce sauce;
    private Topping topping1;
    private Topping topping2;
    
    public Pizza(){
        
    }
    
    public Pizza(Size size, Crust crust, Sauce sauce, Topping topping1, Topping topping2){
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.topping1 = topping1;
        this.topping2= topping2;
    }
    
    
    
    public Crust getCrust() {
        return crust;
    }

    public Size getSize() {
        return size;
    }

    public Topping getTopping1() {
        return topping1;
    }

    public Topping tTopping2() {
        return topping2;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setTopping1(Topping topping1) {
        this.topping1 = topping1;
    }

    public void setTopping2(Topping topping2) {
        this.topping2 = topping2;
    }
    
    
    
}
