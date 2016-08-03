package com.java.sourabh.designPatterns.strategyDesign.example1;

/**
 * Created by Sourabh on 7/8/2016.
 */
public class Animal {

    private String name;
    private double height;
    private double speed;
    private String sound;

    public Flys flyngType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFlyngType() {
        return flyngType.flys();
    }

    public void setFlyngType(Flys flyngType) {
        this.flyngType = flyngType;
    }
}
