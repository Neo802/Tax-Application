package main;

public class TaxInterval {
	double m1, m2; // the multiplier
	double ti1, ti2; // the intervals
	
	public double ProgressiveTax(Landowner landowner) {
		double total = landowner.computeTotalArea();
		
		if (total >= ti1 && total < ti2) {
			total *= landowner.getCity().tax * m1;
			return total;
		}
		else if (total >= ti2){
			total *= landowner.getCity().tax * m2;
			return total;
		}
		else
			return 0;
	
	}
	
	public TaxInterval(double m1, double m2, double ti1, double ti2) {
		this.m1 = m1;
		this.m2 = m2;
		this.ti1 = ti1;
		this.ti2 = ti2;
	}
	
}
