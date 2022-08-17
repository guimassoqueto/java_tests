package objects;

public class Car {
    private final String MAKER;
    private final String MODEL;
    private final int YEAR;
    private final String COLOR;

    public Car(String maker, String model, int year, String color) {
        this.MAKER = maker;
        this.MODEL = model;
        this.YEAR = year;
        this.COLOR = color;
    }

    public void getInfo() {
        System.out.println("CAR INFO");
        System.out.println("Maker: " + this.MAKER);
        System.out.println("Model: " + this.MODEL);
        System.out.println("Year: " + this.YEAR);
        System.out.println("Color: " + this.COLOR);
    }
}
