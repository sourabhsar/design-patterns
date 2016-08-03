package com.java.sourabh.designPatterns.factoryDesign.example1;

/**
 * Created by Sourabh on 7/16/2016.
 */
public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {
        EnemyShip newShip = null;

        if (newShipType.equals("R")) {
            return new RocketEnemyShip();
        } else

            if (newShipType.equals("U")) {
                return new UFOEnemyShip();
            } else

                if (newShipType.equals("B")) {
                    return new BigUFOEnemyShip();
                } else return null;
    }
}
