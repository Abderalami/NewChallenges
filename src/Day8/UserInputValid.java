package Day8;

import java.util.Scanner;

public class UserInputValid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveInteger = 0;

        boolean isValidInput = false;
        while (!isValidInput) {
            System.out.print("Enter a positive integer: ");

            try {
                String inputString = scanner.nextLine();
                positiveInteger = Integer.parseInt(inputString);

                if (positiveInteger > 0) {
                    isValidInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a positive integer (greater than 0).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        System.out.println("You entered: " + positiveInteger);
    }
}

