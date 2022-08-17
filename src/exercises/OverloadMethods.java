package exercises;

public class OverloadMethods {
    public static void main(String[] args) {
        String name = "Guilherme";
        int age = 10;

        hello(name);
        hello(name, age);
    }

    public static void hello(String name) {
        System.out.println("Hello " + name);
    }

    public static void hello(String name, int age) {
        System.out.println("Hello " + name +". You are " + age + " years old.");
    }
}
