package exercises;

public class Array {

    public static void main(String[] args) {
        String[] cars = {"Fusca", "Gol", "Opala", "Belina", "Chevete"};

        int carLen = cars.length;

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
