package com.epam.alex.main.entity;

/**
 * Created by AlexandrSerebryakov on 12.11.2016.
 */
public class FirstBerth extends Seaport implements Runnable {
    public FirstBerth() {
    }

    @Override
    public void run() {
        System.out.println("First berth");
    }

}
