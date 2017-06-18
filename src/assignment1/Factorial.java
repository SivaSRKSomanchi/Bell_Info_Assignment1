package assignment1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,fact=1;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if(n==0 || n==1){
			fact = 1;		
		}
		else{
			while(n>1){
				fact = n*fact;
				n--;
			}
		}
		System.out.println("Factorial of a given number = "+fact);
		sc.close();
	}

}
