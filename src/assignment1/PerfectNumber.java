package assignment1;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum=0,m=0;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in); 
		n = sc.nextInt();
		int k=n;
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum = sum + i;
			}
		}
		
		if(k==sum){
			System.out.println("Number is PerfectNumber");
		}
		else{
			System.out.println("Number is not a PerfectNumber");	
		}
		sc.close();
	}

}
