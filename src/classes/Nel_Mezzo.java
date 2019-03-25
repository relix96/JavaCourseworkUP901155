/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Enums.Crust;
import Enums.Sauce;
import Enums.Size;
import Enums.Topping;


/**
 *
 * @author Zé Maria Valentim
 */
public class Nel_Mezzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Order myOrder = new Order();
        

        myOrder.addOrder(Size.MEDIUM, Crust.THIN, Sauce.PESTO, Topping.EXTRA_CHEESE, Topping.CHILLI);
        myOrder.updatePizza(0, Size.SMALL, Crust.THIN, Sauce.PESTO, Topping.NONE, Topping.NONE);
  
        
        System.out.println(myOrder.getOrder());
    }
    
}
