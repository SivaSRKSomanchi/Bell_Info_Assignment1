package assignment3;

import java.util.Scanner;

public class StudentDetailsUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of Students in a section: ");
		int n = scan.nextInt();
		int id[] = new int[n];
		double fee[] = new double[n];
		String name[] = new String[n];
		char sec[] = new char[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter student " + (i + 1) + " Id : ");
			id[i] = scan.nextInt();
			System.out.println("Enter student " + (i + 1) + " name:");
			name[i] = scan.next();
			System.out.println("Enter student " + (i + 1) + " fee : ");
			fee[i] = scan.nextDouble();
			System.out.println("Enter student " + (i + 1) + " section : ");
			sec[i] = scan.next().charAt(0);
		}
		
//		****** Result*********
//		Id Name Fee Section
//		1 ds 10.50 c
//		2 sd 11.43 e
		
		System.out.println("\n****** Result*********\nId Name Fee Section");
		for (int j = 0; j < sec.length; j++) {
			System.out.print(id[j]+"  ");
			System.out.print(name[j]+"  ");
			System.out.print(fee[j]+"  ");			
			System.out.print(sec[j]+"\n");
		}

	}

}
