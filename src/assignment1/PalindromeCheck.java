package assignment1;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum=0,m=0;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in); 
		n = sc.nextInt();
		int k=n;
		while(n!=0){
			m=n%10;
			sum = sum*10 + m;
			n =n/10;			
		}
		System.out.println();
		if(k==sum){
			System.out.println("Number is Palindrome");
		}
		else{
			System.out.println("Number is not a PalindromeNumber");	
		}


	}

}
