package objects;

import java.util.ArrayList;

public class GarageGarage {
    private int garageCapacity;
    public ArrayList<GarageCar> carsInGarage = new ArrayList<>();

    public GarageGarage(int garageCapacity) {
        this.garageCapacity = garageCapacity;
    }

    public void addCar(GarageCar car) {
        if (this.garageCapacity > 0) {
            this.carsInGarage.add(car);
            this.garageCapacity--;
            System.out.printf("%s %s parked. Current available vacancies: %d\n", car.model, car.plate ,this.garageCapacity);
        } else {
            System.out.printf("You cannotg park %s %s. Garage is full. Car discarded.\n", car.model, car.plate);
        }
    }

    public void listCars() {
        System.out.println("\n\nCARS IN GARAGE: " + this.carsInGarage.size());
        for (GarageCar car: this.carsInGarage) {
            System.out.printf("Model: %s\tPlate: %s\n", car.model, car.plate);
        }
    }
}
