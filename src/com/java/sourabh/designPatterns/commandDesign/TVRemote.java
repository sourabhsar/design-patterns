package com.java.sourabh.designPatterns.commandDesign;

/**
 * Created by Sourabh on 8/8/2016.
 */
public class TVRemote {

    public static ElectronicDevice getDevice() {
        return new Television();
    }
}
