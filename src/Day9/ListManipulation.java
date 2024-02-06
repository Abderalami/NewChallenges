package Day9;

import java.util.ArrayList;

public class ListManipulation {
    public static void main(String[] args) {
        // Initialize an ArrayList with some String values
        ArrayList<String> list = new ArrayList<>();
        list.add("Leo Messi");
        list.add("Cristiano Ronaldo");
        list.add("Tony Kross ");
        list.add("Neymar Junior");
        list.remove("Toney Kross");

        // Check if a specific element exists in the ArrayList
        boolean ext = list.contains("Leo Messi");
        System.out.println("Does 'Cristiano Ronalos are the best player ? " + ext );

        // Print all elements of the ArrayList
        System.out.println("Elements of the ArrayList:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
