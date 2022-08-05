package objects;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of x: ");
        int y = scanner.nextInt();

        System.out.printf("Result: %d", x+y);
        scanner.close();
    }
}
