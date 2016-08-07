package com.java.sourabh.designPatterns.prototypeDesign.example1;

/**
 * Created by Sourabh on 8/7/2016.
 */
public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep is made");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is being made");

        Sheep sheepObject = null;
        try {
            sheepObject = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheepObject;
    }

    @Override
    public String toString() {
        return "Dolly is my Hero, Baaaaa";
    }
}
