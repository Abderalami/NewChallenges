package Day8;

public class NullPointerExp {
    public static void main(String[] args) {
        String myString = null; // Declare but don't initialize

        try {
            // Attempt to access a method on the null reference
            // This will throw a NullPointerException
            myString.toUpperCase();
        } catch (NullPointerException e) {
            // Catch the exception and provide a user-friendly message
            System.out.println("The object reference is null. Please initialize it before using it.");
        }

        // Correct approach: Initialize the object reference
        myString = "i will do it , And Be great develloper";
        System.out.println(myString.toUpperCase());     }
}

