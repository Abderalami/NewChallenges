package Day9;

import java.util.Scanner;

public class Exemple {
    public static void main(String[] args) {
        // Using an array to store integers
        int[] numbers = {5, 10, 3, 8, 9};

        // Accessing elements in the array
        System.out.println("Elements in the array:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Finding the sum of elements in the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of elements: " + sum);

        // Asking the user to enter a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search in the array: ");
        int searchNumber = scanner.nextInt();

        // Searching for the entered number in the array
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                System.out.println(searchNumber + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(searchNumber + " not found in the array.");
        }
    }
}
