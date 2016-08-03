package com.java.sourabh.designPatterns.abstractFactoryDesign.example1.impls;

import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.abstracts.EnemyShip;
import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.abstracts.EnemyShipBuilding;
import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.interfaces.EnemyShipPartsFactory;
import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.model.UFOBossEnemyShip;
import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.model.UFOEnemyShip;

/**
 * Created by Sourabh on 7/30/2016.
 */
public class UFOEnemyShipBuilding extends EnemyShipBuilding{

    @Override
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;

        if(typeOfShip.equals("UFO")) {
            EnemyShipPartsFactory shipPartsFactory  = new UFOEnemyShipPartsFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");
        } else
            if(typeOfShip.equals("UFO BOSS")) {
            EnemyShipPartsFactory shipPartsFactory = new UFOBossEnemyShipPartsFactory();
                theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
                theEnemyShip.setName("UFO Boss Ship");
            }
        return theEnemyShip;
    }
}
