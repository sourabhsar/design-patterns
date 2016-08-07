package com.java.sourabh.designPatterns.decoratorDesign.example1;

/**
 * Created by Sourabh on 8/7/2016.
 */
public class Mozzarella extends ToppingDecorator{


    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarella";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + .50;
    }
}
