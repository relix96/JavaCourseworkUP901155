/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Zé Maria Valentim
 */
public enum Crust {
    THIN(1.08),DEEP(1.10), STUFFED(2.14);
    
    private double crust;

    Crust(double crust){
        this.crust = crust;
    }  
    
    public double getCrust(){
        return this.crust;
    }
    
    public String getInfo(){
        return String.valueOf(crust);
    }
    
}
