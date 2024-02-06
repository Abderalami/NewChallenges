package Day9;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25 };

        // Find and print the sum of all elements in the array
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of all elements: " + sum);

        // Find and print the maximum and minimum values in the array
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        // Reverse the array and print the reversed version
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        System.out.print("Reversed array: ");
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
    }
}
