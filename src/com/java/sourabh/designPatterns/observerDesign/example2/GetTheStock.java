package com.java.sourabh.designPatterns.observerDesign.example2;

import com.java.sourabh.designPatterns.observerDesign.example1.StockGrabber;
import com.java.sourabh.designPatterns.observerDesign.example1.Subject;

import java.text.DecimalFormat;
import java.util.stream.IntStream;

/**
 * Created by Sourabh on 7/16/2016.
 */
public class GetTheStock implements Runnable {

    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetTheStock(int startTime, String stock, double price, Subject stockGrabber) {
        this.startTime = startTime;
        this.stock = stock;
        this.price = price;
        this.stockGrabber = stockGrabber;
    }

    @Override
    public void run() {
        IntStream.rangeClosed(1,20).forEach(i -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            double randNum = (Math.random() * (0.6)) - .03;
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format((price + randNum)));

            if (stock == "IBM") {
                ((StockGrabber)stockGrabber).setIbmPrice(price);
            }

            if (stock == "APPLE") {
                ((StockGrabber)stockGrabber).setIbmPrice(price);
            }

            if (stock == "GOOGLE") {
                ((StockGrabber)stockGrabber).setIbmPrice(price);
            }

            System.out.println(stock + ": "+ df.format((price + randNum)) + " " + df.format(randNum));
            System.out.println();
        });
    }
}
