package com.java.sourabh.designPatterns.decoratorDesign.example1;

/**
 * Created by Sourabh on 8/7/2016.
 */
public class PlainPizza implements Pizza{


    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
