package com.java.sourabh.designPatterns.observerDesign.example1;

import com.java.sourabh.designPatterns.observerDesign.example2.GetTheStock;

/**
 * Created by Sourabh on 7/12/2016.
 */
public class GrabStocks {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver stockObserver1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setGooglePrice(677.60);
        stockGrabber.setApplePrice(676.40);

        StockObserver stockObserver2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setGooglePrice(677.60);
        stockGrabber.setApplePrice(676.40);

        stockGrabber.unRegister(stockObserver1);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setGooglePrice(677.60);
        stockGrabber.setApplePrice(676.40);

        Runnable getIBM = new GetTheStock(2,"IBM",197.00,stockGrabber);
        Runnable getAPPLE = new GetTheStock(2,"APPLE",677.60,stockGrabber);
        Runnable getGOOGLE = new GetTheStock(2,"GOOGLE",676.40,stockGrabber);

        new Thread(getIBM).start();
        new Thread(getAPPLE).start();
        new Thread(getGOOGLE).start();

    }
}
