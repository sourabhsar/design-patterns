package com.java.sourabh.designPatterns.decoratorDesign.example1;

/**
 * Created by Sourabh on 8/7/2016.
 */
public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Sauce");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato Sauce";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + .35;
    }
}
