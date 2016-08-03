package com.java.sourabh.designPatterns.abstractFactoryDesign.example1.abstracts;

import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.interfaces.ESEngine;
import com.java.sourabh.designPatterns.abstractFactoryDesign.example1.interfaces.ESWeapon;

/**
 * Created by Sourabh on 7/19/2016.
 */
public abstract class EnemyShip {

    private String name;
    ESWeapon weapon;
    ESEngine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ESWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(ESWeapon weapon) {
        this.weapon = weapon;
    }

    public ESEngine getEngine() {
        return engine;
    }

    public void setEngine(ESEngine engine) {
        this.engine = engine;
    }

    protected abstract void makeShip();

    @Override
    public String toString() {
        return "The " + name + " has a top speed of " + engine + " and an attack power of " + weapon;
    }

    public void displayEnemyShip() {
        System.out.println("EnemyShip Displayed: "+getName());
    }

    public void followHeroShip() {
        System.out.println(getName() + " is following hero ship");
    }

    public void enemyShipShoots() {
        System.out.println(getName() + " shoots and does damage" + getWeapon());
    }
}
