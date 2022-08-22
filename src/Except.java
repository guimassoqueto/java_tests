import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Dividend: ");
            int dividend = scanner.nextInt();
            System.out.print("Divisor: ");
            int divisor = scanner.nextInt();

            if (divisor == 0) {
                throw new ArithmeticException();
            }

            double result = (double) dividend / divisor;
            System.out.println("Result: " + result);
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
        finally {
            System.out.println("This will always be printed");
        }
    }
}
