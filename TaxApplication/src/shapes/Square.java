package shapes;

public class Square implements Plot {
	
    private double side;

    // CONSTRUCTOR FOR SQUARE CLASS
    public Square(double side) {
        this.side = side;
    }

    public double computeArea() {
        return side * side;
    }
}