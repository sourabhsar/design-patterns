package com.java.sourabh.designPatterns.decoratorDesign.example1;

/**
 * Created by Sourabh on 8/7/2016.
 */
public class PizzaMaker {

    public static void main(String[] args) {
        Pizza basicPizza =  new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());
    }
}
