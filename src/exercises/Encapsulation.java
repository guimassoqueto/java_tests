package exercises;

public class Encapsulation {
    private String attribute1;
    private String attribute2;
    private int attribute3;

    public Encapsulation(String attribute1, String attribute2, int attribute3) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
    }

    public Encapsulation(Encapsulation e) {
        this.copy(e);
    }

    public String setAttribute1() {
        return this.attribute1;
    }

    public String setAttribute2() {
        return this.attribute2;
    }

    public String setAttribute3() {
        return this.attribute1;
    }

    public void setAttribute1(String newAttribute1) {
        this.attribute1 = newAttribute1;
    }

    public void setAttribute2(String newAttribute2) {
        this.attribute2 = newAttribute2;
    }

    public void setAttribute3(String newAttribute3) {
        this.attribute2 = newAttribute3;
    }

    public void copy(Encapsulation e) {
        e.attribute1 = this.attribute1;
        e.attribute2 = this.attribute2;
        e.attribute3 = this.attribute3;
    }
}
