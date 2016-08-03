package com.java.sourabh.designPatterns.strategyDesign.example1;

/**
 * Created by Sourabh on 7/8/2016.
 */
public class Dog extends Animal {

    public void digHole() {
        System.out.println("Dug a hole");
    }

    public Dog() {
        setSound("Bark");
        flyngType = new CantFly();
    }
}
