package objects;

abstract class Vehicle {
    public float maxSpeedKMH;
    public String medium;
    public boolean hasWheels;

    public Vehicle(float maxSpeedKMH, String medium, boolean hasWheels) {
        this.maxSpeedKMH = maxSpeedKMH;
        this.medium = medium;
        this.hasWheels = hasWheels;
    }

    abstract void go();

    public void info() {
        System.out.println("Vehicle info.");
    }
}

public class CarExt extends Vehicle {
    public String brand;

    //super
    public CarExt(float maxSpeedKMH, String medium, boolean hasWheels, String brand) {
        super(maxSpeedKMH, medium, hasWheels);
        this.brand = brand;
    }
    @Override
    public void info() {
        System.out.println("CarExt info.");
    }

    public void go() {
        System.out.println("CarExt class: go() abstract method implemented.");
    }
}
