package org.guessgame;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have 5 chances to guess the correct number.");
        
        Timer timer = new Timer();
        TimerTask task = new Helper();
        timer.schedule(task, 0, 1000);

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        UserInterface ui = new UserInterface();
        ui.start();
    }
}
