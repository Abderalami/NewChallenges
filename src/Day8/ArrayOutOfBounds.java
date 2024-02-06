package Day8;
public class ArrayOutOfBounds {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40}; // Array with 4 elements
        int indexToAccess = 8; // Intentionally out-of-bounds index

        try {
            // Attempt to access the element at the out-of-bounds index
            int element = myArray[indexToAccess];
            System.out.println("Element at index " + indexToAccess + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the exception and provide a user-friendly message
            System.out.println("The index " + indexToAccess + " is out of bounds for the array.");
            System.out.println("The array has " + myArray.length + " elements. Valid indices are 0 to " + (myArray.length - 1));
        }
    }
}

