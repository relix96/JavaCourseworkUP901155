/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Zé Maria Valentim
 */
public enum Sauce {
    
    TOMATO(0.00),PESTO(0.50);
    
    
    private double sauce;

    Sauce(double sauce){
        this.sauce = sauce;
    }  
    
    public double getSauce(){
        return this.sauce;
    }
    
}
