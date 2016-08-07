package com.java.sourabh.designPatterns.prototypeDesign.example1;

/**
 * Created by Sourabh on 8/7/2016.
 */
public class TestCloning {

    public static void main(String[] args) {
        CloneFactory animalMaker = new CloneFactory();
        Sheep sally = new Sheep();

        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);

        System.out.println(clonedSheep);

        System.out.println("Sally Hashcode: " + System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Cloned Hashcode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
    }
}
