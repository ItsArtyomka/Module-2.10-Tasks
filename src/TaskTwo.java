import java.text.DecimalFormat;
import java.util.Scanner;

/*Task: - Calculate the BMI
        - Inform the user about their health
 */
public class TaskTwo {
    public static void calculateBMI() {
        // Create the Scanner
        Scanner userInput = new Scanner(System.in);

        //---User Input---
        System.out.println("Enter your height (in metres): ");
        float userHeight = userInput.nextFloat();
        System.out.println("Enter your weight (in kgs): ");
        float userWeight = userInput.nextFloat();

        //---Calculating BMI---
        float BMI = (float) Math.round((userWeight / Math.pow(userHeight, 2.0f)));
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("Your BMI is " + df.format(BMI));

        //---Checking the BMI---
        if (BMI < 18.5) {
            System.out.println("User is underweight.");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("User is normal weight.");
        } else if (BMI >= 25 && BMI <= 39.9) {
            System.out.println("User is overweight");
        } else if (BMI >= 30) {
            System.out.println("User is obese");
        }
    }
}
