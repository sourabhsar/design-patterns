package com.java.sourabh.designPatterns.abstractFactoryDesign.example1.impls;

import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.interfaces.ESEngine;

/**
 * Created by Sourabh on 7/19/2016.
 */
public class ESUFOEngine implements ESEngine {

    @Override
    public String toString() {
        return "1000 mph";
    }
}
