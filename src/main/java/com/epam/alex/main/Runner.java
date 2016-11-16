package com.epam.alex.main;

import com.epam.alex.main.entity.FirstBerth;
import com.epam.alex.main.entity.SecondBerth;
import com.epam.alex.main.entity.ThirdBerth;

/**
 * Created by AlexandrSerebryakov on 12.11.2016.
 */
public class Runner {


    public static void main(String[] args) {
        FirstBerth firstBerth = new FirstBerth();
        SecondBerth secondBerth = new SecondBerth();
        ThirdBerth thirdBerth = new ThirdBerth();

        new Thread(firstBerth).start();
        new Thread(secondBerth).start();
        new Thread(thirdBerth).start();


    }
}
