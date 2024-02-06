package Day8;
public class UncheckedExp {
    public static void main(String[] args) {
        String myString = null;

        try {
            // Intentionally attempting to call a method on a null reference
            System.out.println(myString.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Cannot perform actions on a null reference."); 

            try {
                int[] myArray = {1, 2, 3};
                System.out.println(myArray[10]);
            } catch (ArrayIndexOutOfBoundsException expt ) {
                System.out.println("ArrayIndexOutOfBoundsException caught: The index is out of the array's bounds.");
            }
        }
    }

}