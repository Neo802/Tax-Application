package shapes;

public class Rectangle implements Plot {
    private double length;
    private double width;

    // CONSTRUCTOR FOR RECTANGLE CLASS
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // GET AREA
    public double computeArea() {
        return length * width;
    }
}
