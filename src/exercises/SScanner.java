package exercises;
import java.util.Scanner;

public class SScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        int age = scanner.nextInt();
        System.out.printf("Your age is %d", age);
    }
}
