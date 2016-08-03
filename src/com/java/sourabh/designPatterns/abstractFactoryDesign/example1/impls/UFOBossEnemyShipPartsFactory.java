package com.java.sourabh.designPatterns.abstractFactoryDesign.example1.impls;

import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.interfaces.ESEngine;
import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.interfaces.ESWeapon;
import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.interfaces.EnemyShipPartsFactory;

/**
 * Created by Sourabh on 7/30/2016.
 */
public class UFOBossEnemyShipPartsFactory implements EnemyShipPartsFactory {
    @Override
    public ESWeapon addESGun() {
        return new ESUFOGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOEngine();
    }
}
