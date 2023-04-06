package towns;

import java.util.ArrayList;

import main.Landowner;
import main.TaxInterval;

public class Towns {
	public String name;
	public double tax;
	public double taxinterv1, taxinterv2;
	public double multiplier1, multiplier2;
	public ArrayList<Landowner> Citizens = new ArrayList<Landowner>();
	public ArrayList<TaxInterval> Taxes = new ArrayList<TaxInterval>();
	
	public double ProgressiveTax(Landowner landowner) {
		double total = 0; // = landowner.computeTotalArea();
		
		for (TaxInterval index : Taxes) {
			double s = index.ProgressiveTax(landowner);
			if (s != 0) {
				total = s;
				break;
			}
		}
		
		return total;
	}
	
	public Towns(String string, double tax, ArrayList<TaxInterval> taxes) {
		// TODO Auto-generated constructor stub
		this.name = string;
		this.tax = tax;

		this.Taxes = taxes;
		
	}
	
	public void findCitizen(Landowner civilian) {
		int isit = 0;
		for (Landowner index : Citizens)
			if (index == civilian) {
				isit = 1;
				break;
			}
		
		if (isit == 1)
			System.out.println(civilian.name + " is the citizen of " + this.name);
		else
			System.out.println(civilian.name + " is not the citizen of " + this.name);
	}
	
	public void AddCitizen(Landowner civilian) {
		Citizens.add(civilian);
	}
	
	public void RemoveCitizen(Landowner civilian) {
		Citizens.remove(civilian);
	}
	
	public void ListTax() {
		if (this.tax < 100)
			System.out.println("Tax per square meter in " + this.name + " is: " + this.tax + " cents");
		else
			System.out.println("Tax per square meter in " + this.name + " is: " + this.tax/100 + " USD");
	}
	
	public void ListCitizens() {
		if (Citizens.size() >= 1) {
			System.out.println("The citizens of " + name + " are: ");
			for (Landowner index : Citizens) {
				System.out.println("-" + index.name);
			}
		}
		else
		{
			System.out.println(name + " doesn't have citizens!");
		}
	}
}
