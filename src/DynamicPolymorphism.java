import dynamicpolymorphism.*;
import java.util.Scanner;

public abstract class DynamicPolymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("Choose an animal");
        System.out.println("1) CAT\n2) DOG");

        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Cat();
            animal.speak();
            return;
        }
        else if (choice == 2) {
            animal = new Dog();
            animal.speak();
            return;
        }
        else {
            System.out.println("Error");
        }
    }
}
