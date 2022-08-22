package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Dividend: ");
            int dividend = scanner.nextInt();
            System.out.println("Divisor: ");
            int divisor = scanner.nextInt();

            double result = (double) dividend / divisor;
        }
        catch (ArithmeticException exception) {
            System.out.println("Stupid! Zero cannot be a divisor. Try again, idiot!");
        }
        catch (InputMismatchException exception) {
            System.out.println("Stupid! You must enter a valid number. Try again, idiot!");
        }
        catch (Exception exception) {
            System.out.println("You are a moron!");
        }
    }
}
