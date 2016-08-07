package com.java.sourabh.designPatterns.decoratorDesign.example1;

/**
 * Created by Sourabh on 8/7/2016.
 */
public abstract class ToppingDecorator implements Pizza{

    protected Pizza tempPizza;

    public ToppingDecorator(Pizza tempPizza) {
        this.tempPizza = tempPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
