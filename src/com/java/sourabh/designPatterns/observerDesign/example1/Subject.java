package com.java.sourabh.designPatterns.observerDesign.example1;

/**
 * Created by Sourabh on 7/12/2016.
 */
public interface Subject {

    public void register(Observer observer);
    public void unRegister(Observer observer);
    public void notifyObserver();
}
