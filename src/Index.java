import objects.Light;

class Index {
    public static void main(String[] args) {
        Light lamp1 = new Light(true);
        lamp1.switchON();
        lamp1.status();
    }
}
