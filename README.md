# Guess-Game-Java

This is a simple number guessing game implemented in Java. The game allows users to select a difficulty level and guess a randomly generated number within a limited number of attempts. The game also tracks the time taken to guess the correct number.

## Features
- Selectable difficulty levels:
  - Easy: 10 chances
  - Medium: 5 chances
  - Hard: 3 chances
- Random number generation between 0 and 99
- Timer to track the time taken to guess the correct number
- Option to play again after each game

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/ahmedllshafiey/Guess-Game-Java.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Guess-Game-Java
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   java -cp target/classes org.guessgame.Main
   ```

## Project Structure
```
src/
  main/
    java/
      org/
        guessgame/
          Helper.java
          Main.java
          RandomNumberGenerator.java
          UserInterface.java
  test/
    java/
```

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.