package com.java.sourabh.designPatterns.strategyDesign.example1;

/**
 * Created by Sourabh on 7/8/2016.
 */
public class Bird extends Animal {

    public Bird () {
        setSound("Tweet");
        flyngType = new ItFlys();
    }
}
