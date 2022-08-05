package objects;

public class Light {
    private boolean on;

    public Light(boolean on) {
        this.on = on;
    }

    public void turnOff() { this.on = false; }

    public void turnOn() { this.on = true; }

    public void switchON() { this.on = !this.on; }

    public void status() {
        String status = this.on ? "ON" : "OFF";
        System.out.println("The Light is turned " + status);
    }
}
