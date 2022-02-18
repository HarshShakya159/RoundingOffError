/*
Harsh Shakya
COMP SCI GRADE 12
Feb 11th, 2022
ROUNDING ERROR
*/

package RoundingError; // Package to start Coding
import javax.swing.*; // Import for the GUI in VS code

public class RoundingErrorHarsh {
    public static void main(String[] args) {
        // Most variables are set as double to be more accurate with the result
        double result; // Double value for the result of the sqaure root.
        int num; // Used to ask the user for the number (Only whole numbers no decimals.)
        int i = 2; // Used as a way to square the number (Int as you can only square with 2)
        double square; // Result for the squared number
        double error; // Rounding off error variable
        /*
        I'm using the double variable as the values can result in decimal numbers and I want to be accurate as 
        possible as stated above.
        */
        String question = JOptionPane.showInputDialog("Please enter a Number"); // Prompt the user to enter a number
        num = Integer.parseInt(question); // Convert to input the number
        result = (Math.sqrt(num)); // Square Root the input number
        square = Math.pow(result, i); // Square the number by using the command Math.pow and using the exponent of 2 (i = 2)
        error = num - square; // Round off error command which is comparing the original number by the squared value (For Exp. 2 - 2.00000000004)


        System.out.println("--------------------------------");
        System.out.println("The square of the square = "+ square); // Display the squared value
        System.out.println("The round off error = "+ error); // Dislpay the round off error.
   
    }
}