package assignment3;

import java.util.Scanner;

public class StudentDetailsControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of Students in a section: ");
		int n = scan.nextInt();
		int id[] = new int[n];
		double fee[] = new double[n];
		String name[] = new String[n];
		char sec[] = new char[n];
		function(0, id, fee, name, sec, n);
		System.out.println("Enter section that you want to see the result : ");
		char a = scan.next().charAt(0);
		System.out.println("\n****** Result*********\nId Name Fee Section");
		section(0, n, sec, a, id, fee, name);
	}

	
	private static void function(int i, int id[], double fee[], String name[],
			char sec[], int n) {
		if (i < n) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter student " + (i + 1) + " id:");
			id[i] = scan.nextInt();
			System.out.println("Enter student " + (i + 1) + " name:");
			name[i] = scan.next();
			System.out.println("Enter student " + (i + 1) + " fee : ");
			fee[i] = scan.nextDouble();
			System.out.println("Enter student " + (i + 1) + " section : ");
			sec[i] = scan.next().charAt(0);
			i++;
			function(i, id, fee, name, sec, n);
		}

	}

	private static void section(int i, int n, char sec[], char a, int id[],
			double fee[], String name[]) {

		if (i < n) {

			if (sec[i] == a) {

				System.out.println(id[i] + " " + name[i] + " " + fee[i] + " "
						+ sec[i]);

			}
			i++;
			section(i, n, sec, a, id, fee, name);
		}

	}

}
