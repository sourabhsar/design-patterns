package com.java.sourabh.designPatterns.strategyDesign.example1;

/**
 * Created by Sourabh on 7/8/2016.
 */
public class CantFly implements Flys {
    @Override
    public String flys() {
        return "I cant fly";
    }
}
