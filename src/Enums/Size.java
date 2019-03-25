/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author Zé Maria Valentim
 */
public enum Size {
    
     SMALL(9.45),MEDIUM(11.87),LARGE(15.90);
    
    
    private double size;

    Size(double size){
        this.size = size;
    }  
    
    public double getSize(){
        return this.size;
    }
    
    public String getInfo(){
        return String.valueOf(size);
    }
    
}
