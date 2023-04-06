package main;
import java.util.ArrayList;
//import java.util.Scanner;

import shapes.Rectangle;
import shapes.Square;
import shapes.Triangle;
import shapes.Circle;
import towns.Towns;

/**
 * 
 * @author Neo802
 *
 */

public class Main {

    public static void main(String[] args) {
        ArrayList <Landowner> landowners = new ArrayList<Landowner>();
        ArrayList <TaxInterval> taxes = new ArrayList<TaxInterval>();
        
        // TaxInterval(multiplier1, multiplier2, value1, value2);
        TaxInterval ti1 = new TaxInterval(1, 5, 1, 1000);
        TaxInterval ti2 = new TaxInterval(5, 25, 1000, 5000);
        TaxInterval ti3 = new TaxInterval(25, 100, 5000, 10000);
        TaxInterval ti4 = new TaxInterval(100, 1000, 10000, 999999999);
        
        taxes.add(ti1);
        taxes.add(ti2);
        taxes.add(ti3);
        taxes.add(ti4);
        
        // Towns(name, multiplier, taxes[]);
        Towns town1 = new Towns("Los Angeles", 1, taxes);

        taxes = new ArrayList<TaxInterval>();
        ti1 = new TaxInterval(1, 5, 1, 40);
        ti2 = new TaxInterval(5, 28, 40, 1400);
        ti3 = new TaxInterval(28, 60, 5000, 999999999);
        
        taxes.add(ti1);
        taxes.add(ti2);
        taxes.add(ti3);
        
        Towns town2 = new Towns("New York City", 0.3, taxes);
        
        // Landowner(name, town);
        Landowner landowner1 = new Landowner("Albert",town1);
        Landowner landowner2 = new Landowner("John Doe", town1);
        Landowner landowner3 = new Landowner("Elon Musk", town1);

        Rectangle plot = new Rectangle(2, 3);
        Triangle plot2 = new Triangle(3, 5);
        Square plot3 = new Square(2);
        Circle plot4 = new Circle(4);
        Circle plot5 = new Circle(5);
        landowner1.addPlot(plot);
        landowner1.addPlot(plot2);
        landowner1.addPlot(plot3);
        landowner1.addPlot(plot4);
        landowner1.addPlot(plot5);

        plot = new Rectangle(4, 2);
        plot2 = new Triangle(21, 7);
        plot3 = new Square(62);
        plot4 = new Circle(12);
        landowner2.addPlot(plot);
        landowner2.addPlot(plot2);
        landowner2.addPlot(plot3);
        landowner2.addPlot(plot4);

        plot = new Rectangle(42, 22);
        plot2 = new Triangle(213, 73);
        plot3 = new Square(624);
        plot4 = new Circle(122);
        landowner3.addPlot(plot);
        landowner3.addPlot(plot2);
        landowner3.addPlot(plot3);
        landowner3.addPlot(plot4);
        
        landowners.add(landowner1);
        landowners.add(landowner2);
        landowners.add(landowner3);
        
        Tax tax = new Tax(landowners);
        // System.out.println(landowners.get(0).name); 
        // would output Albert
        town1.ListTax();
        town2.ListTax();
        System.out.println("=========================");
        
        town1.ListCitizens();
        town2.ListCitizens();

        System.out.println("========= TAXES ==========");
        for (Landowner index : landowners) {
        	tax.printTax(index);
        }
        
        tax.getTotalTax();
        tax.getCityTax(town1);
        tax.getCityTax(town2);
        //tax.getCityTax();
        System.out.println("=========================");
        
        landowners.get(0).moveTown(town2);
        landowners.get(2).moveTown(town2);
        
        town1.ListCitizens();
        town2.ListCitizens();

        System.out.println("========= TAXES ==========");
        for (Landowner index : landowners) {
        	tax.printTax(index);
        }
        tax.getTotalTax();
        tax.getCityTax(town1);
        tax.getCityTax(town2);
        System.out.println("=========================");
    }

}
