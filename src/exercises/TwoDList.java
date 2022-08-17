package exercises;

import java.util.ArrayList;

public class TwoDList {
    public static void main(String[] args) {
        ArrayList<String> firstNames = new ArrayList<>();
        firstNames.add("Jonas");
        firstNames.add("John");

        ArrayList<String> lastNames = new ArrayList<>();
        lastNames.add("Smith");
        lastNames.add("Jones");

        ArrayList<ArrayList<String>> allNames= new ArrayList<>();
        allNames.add(firstNames);
        allNames.add(lastNames);

        for (ArrayList<String> array: allNames) {
            for(String str: array) {
                System.out.println(str);
            }
        }
    }
}
