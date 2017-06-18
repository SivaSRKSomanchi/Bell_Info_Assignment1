package assignment1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,a=0,b=1,fib=0;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.print("FibonacciSeries upto given number = "+a+" "+b);
		for(int i=2;n>fib;i++){ // or start i with 3
			 fib = a+b;
			 a=b;
			 b=fib;
			 System.out.print(" "+fib);
		}
		sc.close();
		
	}

}
