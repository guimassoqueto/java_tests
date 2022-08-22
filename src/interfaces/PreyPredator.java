package interfaces;

public class PreyPredator implements Prey, Predator {
    @Override
    public void flee() {
        System.out.println("PreyPredator is a prey now. Fleeing.");
    }

    @Override
    public void attack() {
        System.out.println("PreyPredator is a prey now. Attacking.");
    }
}
