package org.guessgame;

import java.util.TimerTask;

class Helper extends TimerTask {

    public static int i = 1;

    @Override
    public void run() {
        i++;
    }

    public static int getTimerValue() {
        return i;
    }
}