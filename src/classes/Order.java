/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import Enums.*;

import java.util.ArrayList;

/**
 *
 * @author Zé Maria Valentim
 */
public class Order {
   private ArrayList<Pizza> pizzas;
    
    public Order(){
        pizzas = new ArrayList<Pizza>();
    }
    
    public void addOrder(Size size, Crust crust, Sauce sauce, Topping topping1, Topping topping2){
        Pizza pizza = new Pizza(size,crust,sauce,topping1,topping2);
        pizzas.add(pizza);
    }
    
     public String getOrder(){   
        String info="";
        for (Pizza p : pizzas){
            info+= p.pizzaInfo();
        }       
        return info;                
    }
     
     public double getCostOrder(){         
         double costOrder=0;         
          for (Pizza p : pizzas){
            costOrder+= p.pizzaCost();
        }               
         return costOrder;
     }
     
     public int getCountPizzas(){        
         return pizzas.size();
     }
     
     public void deletePizza(int idx){
         pizzas.remove(idx);
     }
     
     public void updatePizza(int idx, Size size, Crust crust, Sauce sauce, Topping topping1, Topping topping2){
        pizzas.get(idx).setSize(size);
        pizzas.get(idx).setCrust(crust);
        pizzas.get(idx).setSauce(sauce);
        pizzas.get(idx).setTopping1(topping1);
        pizzas.get(idx).setTopping2(topping2);
     }
     
      public void updatePizza(int idx, Pizza pizza){
         pizzas.set(idx, pizza);
     }


}


