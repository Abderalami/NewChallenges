package Day9;

import java.util.ArrayList;
class ArrayExample {
    public static void main(String args[]) {
        //creating ArrayList of string type
        ArrayList<String> arrList = new ArrayList<>();

        //adding few elements
        arrList.add(    0,"Cricket"); //list: ["Cricket"]
        arrList.add(1,"Hockey"); //list: ["Cricket", "Hockey"]
        arrList.add(2, "BasketBall"); //list: ["BasketBall", "Cricket", "Hockey"]



        System.out.println("ArrayList Elements: ");
        //Traversing ArrayList using enhanced for loop
        for (String str : arrList)
            System.out.println(str);
    }
}