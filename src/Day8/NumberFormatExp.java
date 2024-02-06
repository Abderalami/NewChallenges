package Day8;

import java.util.Scanner;

public class NumberFormatExp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String inputString = scanner.nextLine();

        try {
            // Attempt to convert the input string to an integer
            int number = Integer.parseInt(inputString);
            System.out.println("You entered the number: " + number);
        } catch (NumberFormatException e) {
            // Catch the exception if the input is not a valid integer
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}

