package com.java.sourabh.designPatterns.commandDesign;

/**
 * Created by Sourabh on 8/8/2016.
 */
public class Television implements ElectronicDevice {
    private int volume = 0;

    @Override
    public void on() {
        System.out.println("TV is ON");
    }

    @Override
    public void off() {
        System.out.println("TV is OFF");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("TV Volume is at " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("TV Volume is at " + volume);
    }
}
