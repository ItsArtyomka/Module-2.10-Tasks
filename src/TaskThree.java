import java.util.Random;
import java.util.Scanner;

public class TaskThree {
    public static void guessNumberGame() {

        //---Random() Setting---
        // Create the Random object
        Random rand = new Random();

        // Initialise the variable
        int randInt;

        // Creating the range of the random numbers
        randInt = rand.nextInt(10) + 1;

        //---User Input---
        // Creating Scanner object
        Scanner userInput = new Scanner(System.in);

        //---Logic---
        while (true) {
            System.out.println("Enter a guess from 1 to 10: ");
            // User Input
            int userGuess = userInput.nextInt();

            // Checking the userGuess with the
            if (userGuess == randInt) {
                System.out.println("Nice! You guessed my number. \n");
                break;
            }
            else if (userGuess > randInt) { System.out.println("My number is smaller. \n"); }
            else { System.out.println("My number is bigger. \n"); }

        }
    }
}