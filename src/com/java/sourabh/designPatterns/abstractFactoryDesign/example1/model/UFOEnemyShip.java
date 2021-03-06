package com.java.sourabh.designPatterns.abstractFactoryDesign.example1.model;

import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.abstracts.EnemyShip;
import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.interfaces.EnemyShipPartsFactory;

/**
 * Created by Sourabh on 7/19/2016.
 */
public class UFOEnemyShip extends EnemyShip {

    EnemyShipPartsFactory shipFactory;

    public UFOEnemyShip(EnemyShipPartsFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    @Override
    protected void makeShip() {
        System.out.println("Make Enemy Ship " + getName());
        setWeapon(shipFactory.addESGun());
        setEngine(shipFactory.addESEngine());
    }
}
