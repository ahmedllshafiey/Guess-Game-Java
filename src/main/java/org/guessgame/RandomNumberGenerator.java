package org.guessgame;

import java.util.Random;

public class RandomNumberGenerator {

    public static int getRandom() {
        Random r = new Random();
        int r_num = r.nextInt(100);
        return  r_num;
    }
}