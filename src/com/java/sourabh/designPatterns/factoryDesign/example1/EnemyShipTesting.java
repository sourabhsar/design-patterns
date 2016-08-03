package com.java.sourabh.designPatterns.factoryDesign.example1;

import java.util.Scanner;

/**
 * Created by Sourabh on 7/16/2016.
 */
public class EnemyShipTesting {

    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("What type of ship? (U/R Or B)");

        if (userInput.hasNextLine()) {
            String typeOfShip = userInput.next();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }
        doStuffEnemy(theEnemy);
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
