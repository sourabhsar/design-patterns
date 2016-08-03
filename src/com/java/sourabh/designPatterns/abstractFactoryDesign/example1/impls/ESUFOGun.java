package com.java.sourabh.designPatterns.abstractFactoryDesign.example1.impls;

import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.interfaces.ESWeapon;

/**
 * Created by Sourabh on 7/19/2016.
 */
public class ESUFOGun implements ESWeapon {

    @Override
    public String toString() {
        return "20 damage";
    }
}
