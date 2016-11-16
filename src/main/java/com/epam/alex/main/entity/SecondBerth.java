package com.epam.alex.main.entity;

/**
 * Created by AlexandrSerebryakov on 12.11.2016.
 */
public class SecondBerth extends Seaport implements Runnable {
    volatile int x = 2;
    public SecondBerth() {
    }

    @Override
    public void run() {
        System.out.println("Second berth");
        if (x%2 == 0)
            System.out.println("Число чётное: " + x);
    }
}
