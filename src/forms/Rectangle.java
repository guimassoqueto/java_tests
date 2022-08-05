package forms;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int area() {
        return this.width * this.height;
    }

    public void format() {
        if(this.height == this.width) {
            System.out.println("Rhombus");
        } else {
            System.out.println("Rectangle");
        }
    }
}
