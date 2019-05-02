/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Zé Maria Valentim
 */
public enum Topping {
    
     NONE(0.00),OLIVES(0.08),EXTRA_CHEESE(0.02),CHILLI(0.06),PEPPERONI(0.10),MUSHROOM(0.03),ROCKET(0.05),JALAPENOS(0.20),ONION(0.07),ANCHOVY(0.09);

    private double topping;

    Topping(double topping){
        this.topping = topping;
    }
    
    public double getTopping(){
        return this.topping;
    }    
    
    
}
