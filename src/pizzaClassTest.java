/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Zé Maria Valentim
 */
public class pizzaClassTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // -------------------------------------------------------Task 1-------------------------------------------------
        System.out.println("-----------------Task 1: Create a new pizza----------------------------------------");
       
        Pizza pizza = new Pizza(Size.MEDIUM, Crust.THIN, Sauce.PESTO, Topping.EXTRA_CHEESE, Topping.CHILLI);
        
        
        System.out.println("----------- Information of the pizza: "+pizza.pizzaInfo());
        System.out.println("----------- Cost of the pizza: "+pizza.pizzaCost());
       
        
        System.out.println("-----------------Task 2----------------------------------------");
        
        
        System.out.println("----------- Change the topping1 to Mushroom: ");
        pizza.setTopping1(Topping.MUSHROOM);        
        System.out.println("----------- Information of the pizza updated: "+pizza.pizzaInfo());
        
        System.out.println("----------- Create an Order");
        Order myOrder = new Order();
        
        System.out.println("----------- Add pizza to myOrder");
        myOrder.addOrder(pizza);
        System.out.println("----------- Print my order: "+myOrder.getOrder());
        
        System.out.println("----------- Create pizza2, pizza3, pizza4 and pizza5");
        Pizza pizza2 = new Pizza(Size.LARGE, Crust.STUFFED, Sauce.TOMATO, Topping.EXTRA_CHEESE, Topping.CHILLI);
        Pizza pizza3 = new Pizza(Size.SMALL, Crust.THIN, Sauce.TOMATO, Topping.MUSHROOM, Topping.OLIVES);
        Pizza pizza4 = new Pizza(Size.MEDIUM, Crust.THIN, Sauce.PESTO, Topping.EXTRA_CHEESE, Topping.CHILLI);
        Pizza pizza5 = new Pizza(Size.MEDIUM, Crust.THIN, Sauce.PESTO, Topping.EXTRA_CHEESE, Topping.CHILLI);
        System.out.println("----------- Add pizza2, pizza3, pizza4 and pizza5 to my Order ");
        myOrder.addOrder(pizza2);
        myOrder.addOrder(pizza3);
        myOrder.addOrder(pizza4);
        myOrder.addOrder(pizza5);
        
        System.out.println("----------- Show order with pizza2, pizza3, pizza4 and pizza5 to my Order "+myOrder.getOrder());
        
        System.out.println("----------- Update topping 1 on the pizza 3 to Peperoni on the position 3 on the myOrder");
        pizza3.setTopping1(Topping.PEPPERONI);
        myOrder.updatePizza(4, pizza3);
        System.out.println("----------- Show order with pizza updated");
        System.out.println(myOrder.getOrder());
        
        System.out.println("----------- Delete pizza on myOrder on the possition 3 ");
        myOrder.deletePizza(3);
        System.out.println("----------- Show myOrder without pizza on the 3 position");
        System.out.println(myOrder.getOrder());
        
    }
    
}
