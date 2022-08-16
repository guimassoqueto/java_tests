package exercises;

public class ChangeVars {
    public static void main(String[] args) {
        String hello = "Hello";
        String bye = "Bye";

        String temp;

        temp = hello;
        hello = bye;
        bye = temp;

        System.out.printf("Hello: [%s]\nBye: [%s]", bye, hello);
    }
}
