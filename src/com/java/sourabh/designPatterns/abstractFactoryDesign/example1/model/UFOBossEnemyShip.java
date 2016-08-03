package com.java.sourabh.designPatterns.abstractFactoryDesign.example1.model;

import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.abstracts.EnemyShip;
import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.interfaces.EnemyShipPartsFactory;

/**
 * Created by Sourabh on 7/30/2016.
 */
public class UFOBossEnemyShip extends EnemyShip {

    EnemyShipPartsFactory shipFactory;

    public UFOBossEnemyShip(EnemyShipPartsFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    @Override
    protected void makeShip() {
        System.out.println("Make Enemy Ship " + getName());
        setWeapon(shipFactory.addESGun());
        setEngine(shipFactory.addESEngine());
    }
}
