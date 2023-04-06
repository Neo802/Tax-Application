package shapes;

public class Circle implements Plot {

	private double radius;

    // CONSTRUCTOR FOR CIRCLE CLASS
	public Circle(double radius) {
		this.radius = radius;
	}
    
	public double computeArea() {
		return Math.PI * radius * radius;
	}
}
