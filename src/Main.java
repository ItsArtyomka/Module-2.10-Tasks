/* Code written by Artyom */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Choose the task that you want to see: ");
        System.out.println("There are Task 1 , Task 2 ,..., Task 17");

        Scanner userInput = new Scanner(System.in);
        char taskNumber = (char) userInput.nextShort();


        switch (taskNumber) {
            case 1 -> TaskOne.displayNumbers();
            case 2 -> TaskTwo.calculateBMI();
            case 3 -> TaskThree.guessNumberGame();
        }
    }
}
