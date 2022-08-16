package exercises;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Gaymen";

        boolean isEqual = name.equalsIgnoreCase("gayMEN");
        int nameLen = name.length();
        char charAtPosition = name.charAt(2);
        int result = name.indexOf("G");

        System.out.println(isEqual);
        System.out.println(nameLen);
        System.out.println(charAtPosition);
        System.out.println(result);
    }
}
