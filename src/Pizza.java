/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




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

    public Pizza() {

    }

    public Pizza(Size size, Crust crust, Sauce sauce, Topping topping1, Topping topping2) {
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.topping1 = topping1;
        this.topping2 = topping2;
    }

    public double pizzaCost() {
        double cost = size.getSize() + crust.getCrust() + sauce.getSauce() + topping1.getTopping() * 5 + topping2.getTopping() * 4;
        double newCost =  Math.round(cost*100.0)/100.0;
        return newCost;
    }

    public String pizzaInfo() {
        String info = "";
        double cost = pizzaCost();

        info += "TOTAL COST: £" + String.valueOf(cost) + "\n";
        info += String.valueOf(size) + " Size: " + "£" + size.getSize() + "\n";
        info += String.valueOf(crust) + " Crust: " + "£" + crust.getCrust() + "\n";
        info += "BASE COST: " + "£" + (size.getSize()+crust.getCrust()) + "\n";
        info += String.valueOf(topping1) + ": " + "5*£" + topping1.getTopping() + "=£" + topping1.getTopping() * 5 + "\n";
        info += String.valueOf(topping2) + ": " + "4*£" + topping2.getTopping() + "=£" + topping2.getTopping() * 4 + "\n\n";

        return info;
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

    public Topping gettTopping2() {
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
