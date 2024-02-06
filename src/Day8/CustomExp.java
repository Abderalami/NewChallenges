package Day8;

public class CustomExp extends Exception {
    public CustomExp(String message) {
        super(message);
    }
}
 class MainCustom {
    public static void main(String[] args) {
        try {
            validateNumber(10); // Valid input
            validateNumber(-5); // This will cause an exception
        } catch (CustomExp e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public static void validateNumber(int number) throws CustomExp {
        if (number < 0) {
            throw new CustomExp("Number must be positive");
        }
        System.out.println("Valid number: " + number);
    }
}

