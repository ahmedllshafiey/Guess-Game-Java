package org.guessgame;

import java.util.Scanner;

class UserInterface {
    
    boolean gameLoop = true;
    int difficultyLevel;
    int randNum;
    int guessNumber;

    void delay(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @SuppressWarnings("unused")
    void start() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (gameLoop) {
                randNum = RandomNumberGenerator.getRandom(); // Reset random number for each game
                
                System.out.println("Please select the difficulty level:");
                delay(1);
                
                System.out.println("1. Easy (10 chances)");
                System.out.println("2. Medium (5 chances)");
                System.out.println("3. Hard (3 chances)");
                
                System.out.println("\n");
                delay(1);
                
                System.out.print("Enter your choice: ");
                this.difficultyLevel = scanner.nextInt();
                delay(1);
                
                switch (this.difficultyLevel) {
                    case 1 -> System.out.println("Great! You have selected Easy level.");
                    case 2 -> System.out.println("Great! You have selected Medium level.");
                    case 3 -> System.out.println("Great! You have selected Hard level.");
                    default -> {
                        System.out.println("Invalid choice. Please select a valid difficulty level.");
                        delay(1);
                        continue;
                    }
                }
                
                System.out.println("Let's start the game! Guess a number between 0 and 99.");
                delay(1);
                
                int chances = switch (this.difficultyLevel) {
                    case 1 -> 10;
                    case 2 -> 5;
                    case 3 -> 3;
                    default -> 0;
                };
                
                while (chances > 0) {
                    System.out.print("Enter your guess: ");
                    this.guessNumber = scanner.nextInt();
                    
                    if (this.guessNumber == this.randNum) {
                        System.out.println("Congratulations! You've guessed the correct number in " + Helper.getTimerValue() + " seconds!");
                        break;
                    } else if (this.guessNumber < this.randNum) {
                        System.out.println("Too low! Try again.");
                    } else {
                        System.out.println("Too high! Try again.");
                    }
                    
                    chances--;
                    System.out.println("Chances left: " + chances);
                }
                
                if (chances == 0) {
                    System.out.println("Game over! The correct number was: " + this.randNum);
                }
                
                System.out.print("Do you want to play again? (yes/no): ");
                String playAgain = scanner.next();
                
                if (!playAgain.equalsIgnoreCase("yes")) {
                    System.out.println("Thank you for playing! Goodbye!");
                    gameLoop = false;
                }
            }
        }
    }
}