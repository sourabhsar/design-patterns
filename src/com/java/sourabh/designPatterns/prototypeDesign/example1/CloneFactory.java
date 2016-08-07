package com.java.sourabh.designPatterns.prototypeDesign.example1;

/**
 * Created by Sourabh on 8/7/2016.
 */
public class CloneFactory {

    public Animal getClone(Animal animalSample) {
        return animalSample.makeCopy();
    }
}
