package shapes;

public class Triangle implements Plot {
	
    private double base, height;

    // CONSTRUCTOR FOR TRIANGLE CLASS
	/*
	 * public Triangle(double base, double height) { this.base = base; this.height =
	 * height; }
	 */

    public Triangle(double base, double height) {
    	this.base = base; 
    	this.height = height;
    }
    
    public double computeArea() {
        return (base * height) / 2;
    }
    
    
    
//    public void TriangleInit(double base, double height) {
//    	this.base = base; 
//    	this.height = height;
//    }
}
