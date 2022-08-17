package exercises;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>();

        foods.add("Pizza");
        foods.add("Lasagna");

        for (String food: foods) {
            System.out.println(food);
        }
    }

}
