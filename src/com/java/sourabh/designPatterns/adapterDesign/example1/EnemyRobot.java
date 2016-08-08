package com.java.sourabh.designPatterns.adapterDesign.example1;

import java.util.Random;

/**
 * Created by Sourabh on 8/8/2016.
 */
public class EnemyRobot {

    Random generator = new Random();

    public void smashWithHands() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot causes " + attackDamage + " Damage with its hands");
    }

    public void walkForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot walks forward " + movement + " spaces");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot tramps on " + driverName);
    }
}
