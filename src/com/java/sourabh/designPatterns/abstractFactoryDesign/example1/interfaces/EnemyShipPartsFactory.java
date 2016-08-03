package com.java.sourabh.designPatterns.abstractFactoryDesign.example1.interfaces;

/**
 * Created by Sourabh on 7/19/2016.
 */
public interface EnemyShipPartsFactory {
    ESWeapon addESGun();
    ESEngine addESEngine();
}
