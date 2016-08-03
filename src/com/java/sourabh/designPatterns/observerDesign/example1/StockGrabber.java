package com.java.sourabh.designPatterns.observerDesign.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sourabh on 7/12/2016.
 */
public class StockGrabber implements Subject {

    private List<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unRegister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer "+ (observerIndex +1)+ " deleted");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(ibmPrice,applePrice,googlePrice));
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }
}
