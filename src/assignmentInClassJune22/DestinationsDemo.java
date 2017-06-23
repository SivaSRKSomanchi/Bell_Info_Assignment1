package assignmentInClassJune22;

import java.util.Arrays;
import java.util.Scanner;

public class DestinationsDemo {

	public static void main(String[] args) {

		// Destinations informations
		// 1st Destination
		// String[] d1Hotels = {"Hyat","Prestige","Raheja"};
		// double[] d1Cost = {200.00,350.50,500.60};
		// int[] d1Days = {3,5,8};
		// Destinations hydDest = new Destinations("Hyd", "TG",d1Hotels ,d1Cost
		// ,d1Days);
		// //2nd Destination
		// String[] d2Hotels = {"Amaravati","Sagar","Tripta"};
		// double[] d2Cost = {280.00,550.50,600.60};
		// int[] d2Days = {2,5,10};
		// Destinations AmarDest = new Destinations("Amaravati", "AP",d2Hotels
		// ,d2Cost ,d2Days);
		// //3rd Destination
		// String[] d3Hotels = {"Hyatt1","ALLInONE","Extended"};
		// double[] d3Cost = {210.00,750.50,590.60};
		// int[] d3Days = {3,5,8};
		// Destinations goaDest = new Destinations("Goa", "MT",d3Hotels ,d3Cost
		// ,d3Days);
		
		Destinations dest;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. of Destinations: ");
		int destinationsCount = input.nextInt();
		Destinations d[] = new Destinations[destinationsCount];
		for (int i = 0; i < d.length; i++) {
			System.out.println("Enter your destination: ");
			String destinationName = input.next();
			System.out.println("Enter your destination location :");
			String destinationLocation = input.next();
			System.out.println("Enter no. of Hotels at your Destination: ");
			int hotelsCount = input.nextInt();
			String[] hotelNames = new String[hotelsCount];
			double[] packages = new double[hotelsCount];
			int[] days = new int[hotelsCount];
			System.out.println("Hotel Names: ");
			for (int j = 0; j < hotelsCount; j++) {

				hotelNames[j] = input.next();
			}
			System.out.println("Packages available at those hotels: ");
			for (int j = 0; j < hotelsCount; j++) {

				packages[j] = input.nextDouble();
			}
			System.out.println("Days with respect to package: ");
			for (int j = 0; j < hotelsCount; j++) {

				days[j] = input.nextInt();
			}
			dest = new Destinations(destinationName, destinationLocation,
					hotelNames, packages, days);
			d[i] = dest;

		}

		System.out.println();
		//
		// // Hyd in TG and Pakage Details:
		// // 1. Hyat - 200 - 3 days package
		// // 2. Prestigate - 350.50 5 days package
		//
		// Destinations[] d = new Destinations[3];
		// d[0] = hydDest;
		// d[1] = AmarDest;
		// d[2] = goaDest;
		//
		// Let the customer enter his destination, so that we display the
		// package avaliable.

		System.out
				.println("Welcome to our website, Please enter your destination ?");
		Scanner scan = new Scanner(System.in);
		String customerDest = scan.next();
		boolean found = false;
		for (int i = 0; i < d.length; i++) {
			Destinations dd = d[i];
			if (customerDest.equals(dd.getName())) {
				found = true;
				System.out
						.println("Good News...we found your destination with awesome package. Here are the details");
				System.out.println(dd.getName() + " is in " +dd.getLocation() + " and Package Details are : \n"+dd.toString());
				break;
			}
		}

		if (!found) {
			System.out
					.println("Ohh...Sorry, We couldn't find your destination. Please check beck.");
		}

	}

}

class Destinations {
	private String name;
	private String location;
	private String[] hotels;
	private double[] packageCost;
	private int[] noOfDays;

	Destinations() {

	}

	Destinations(String name, String location, String[] hotels, double[] cost,
			int[] days) {
		this.name = name;
		this.location = location;
		this.hotels = hotels;
		packageCost = cost;
		noOfDays = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String[] getHotels() {
		return hotels;
	}

	public void setHotels(String[] hotels) {
		this.hotels = hotels;
	}

	public double[] getPackageCost() {
		return packageCost;
	}

	public void setPackageCost(double[] packageCost) {
		this.packageCost = packageCost;
	}

	public int[] getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int[] noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		String str = "";

		for (int i = 0; i < hotels.length; i++) {
			str = str+(i + 1) + ". " + hotels[i] + " - " + "Package Cost: "+packageCost[i]
					+ " - Nuber of days : " + noOfDays[i] + "\n";

		}

		// Hyd in TG and Pakage Details:
		// // 1. Hyat - 200 - 3 days package
		// // 2. Prestigate - 350.50 5 days package
		//
		// return "Destinations [name=" + name + ", location=" + location
		// + ", hotels=" + Arrays.toString(hotels) + ", packageCost="
		// + Arrays.toString(packageCost) + ", noOfDays="
		// + Arrays.toString(noOfDays) + "]";

		return str;
	}

}