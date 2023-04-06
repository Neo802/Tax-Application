package main;
import java.util.ArrayList;

import towns.Towns;

public class Tax {
	private ArrayList<Landowner> landowners = new ArrayList<Landowner>();	
	
	public void printTax(Landowner landowner) {
		double total = landowner.getCity().ProgressiveTax(landowner); //* landowner.getCity().tax);
		
		//total = sumTax(landowner, total);
		
		if (total < 100)
			System.out.println(landowner.name + " has to pay: " + String.format("%.0f", total) + " cents");
		else
			System.out.println(landowner.name + " has to pay: " + String.format("%.2f", total/100) + " USD");
	}
	
	public void getCityTax(Towns City) {
		double total = 0;

		for (Landowner index : City.Citizens) {
			total += City.ProgressiveTax(index);
			//double sum = sumTax(index, index.computeTotalArea());
			//total += sum;
			//total += (index.computeTotalArea() * index.getCity().tax);
		}
		
		if (total < 100)
			System.out.println("Total tax in " + City.name + " is: " + String.format("%.0f", total) + " cents");
		else
			System.out.println("Total tax in " + City.name + " is: " + String.format("%.2f", total/100) + " USD");
	}
	
	public void getTotalTax() {
		double total = 0;
		for (Landowner index : landowners) {
			total += index.getCity().ProgressiveTax(index);
			//double sum = sumTax(index, index.computeTotalArea());
			//total += sum;
			//total += (index.computeTotalArea() * index.getCity().tax);
		}
		
		if (total < 100)
			System.out.println("Total tax is: " + String.format("%.0f", total) + " cents");
		else
			System.out.println("Total tax is: " + String.format("%.2f", total/100) + " USD");
	}
	
	public Tax(ArrayList<Landowner> landowners) {
		this.landowners = landowners;
	}
	
}
