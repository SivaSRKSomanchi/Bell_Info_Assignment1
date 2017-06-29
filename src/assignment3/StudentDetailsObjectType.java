package assignment3;

import java.util.Scanner;

public class StudentDetailsObjectType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of Students in a section: ");
		int n = scan.nextInt();
		int id[] = new int[n];
		double fee[] = new double[n];
		String name[] = new String[n];
		char sec[] = new char[n];
		Student stu;
		Student student[] = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter student " + (i + 1) + " Id : ");
			id[i] = scan.nextInt();
			System.out.println("Enter student " + (i + 1) + " name:");
			name[i] = scan.next();
			System.out.println("Enter student " + (i + 1) + " fee : ");
			fee[i] = scan.nextDouble();
			System.out.println("Enter student " + (i + 1) + " section : ");
			sec[i] = scan.next().charAt(0);
			stu = new Student(n, id, fee, name, sec);
			student[i]=stu;
		}

//		System.out.println("\n****** Result*********\nId Name Fee Section");
		for (int j = 0; j < sec.length; j++) {
			System.out.println(student[j]);

		}

	}

}

class Student{
	int n = 0;
	int id[];
	double fee[];
	String name[];
	char sec[];
	
	public Student(int n, int[] id, double[] fee, String[] name, char[] sec) {
		super();
		this.n = n;
		this.id = id;
		this.fee = fee;
		this.name = name;
		this.sec = sec;
	}
	public String toString() {
		String str = "";
		System.out.println("\n****** Result*********\nId Name Fee Section");
		for (int i = 0; i < id.length; i++) {
			str = str+ id[i] +"  "+name[i]+ "  " + fee[i]+"  "+sec[i] + "\n";

		}
		return str;
	}
}

	

