package main;
import java.util.ArrayList;

import shapes.Plot;
import towns.Towns;

public class Landowner {
    //private ArrayList<Rectangle> plots;
	private ArrayList<Plot> plots = new ArrayList<Plot>();	
	private Towns town;
	public String name;
	
	// ADD A VALUE IN THE ARRAY
    public void addPlot(Plot plot) {
        plots.add(plot);
    }

	// REMOVE A VALUE FROM THE ARRAY
    public void removePlot(Plot plot) {
        plots.remove(plot);
    }
    
    // RETRIEVES THE AREA AT A SPECIFIC POSITION
    public double getArea(int pos) {
    	if (pos < 0) return -1;
    	
    	return plots.get(pos).computeArea();
    }

    public Towns getCity() {
    	return town;
    }
    
    public void moveTown(Towns town) {
    	this.town.RemoveCitizen(this);
    	this.town = town;
    	this.town.AddCitizen(this);
    }
    
    // RETRIEVES THE TOTAL AREA
    public float computeTotalArea() {
    	float totalArea = 0;
        for (Plot plot : plots) {
            totalArea += plot.computeArea();
        }
        return totalArea;
    }
    
    public Landowner(String name, Towns town) {
    	this.name = name;
    	this.town = town;
    	
    	town.AddCitizen(this);
    }
    
}
