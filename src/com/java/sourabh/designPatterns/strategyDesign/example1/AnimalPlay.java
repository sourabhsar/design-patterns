package com.java.sourabh.designPatterns.strategyDesign.example1;

/**
 * Created by Sourabh on 7/8/2016.
 */
public class AnimalPlay {

    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.getFlyngType());
        System.out.println("Bird: " + tweety.getFlyngType());

        sparky.setFlyngType(new ItFlys());

        System.out.println("Dog: " + sparky.getFlyngType());
    }
}
