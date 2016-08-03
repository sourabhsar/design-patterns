package com.java.sourabh.designPatterns.abstractFactoryDesign.example1;

import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.abstracts.EnemyShip;
import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.abstracts.EnemyShipBuilding;
import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.impls.UFOEnemyShipBuilding;

/**
 * Created by Sourabh on 7/19/2016.
 */
public class EnemyShipPlay {

    public static void main(String[] args) {

        EnemyShipBuilding makeUFOs  = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = makeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = makeUFOs.orderTheShip("UFO BOSS");
        System.out.println(theBoss+ "\n");
    }
}
