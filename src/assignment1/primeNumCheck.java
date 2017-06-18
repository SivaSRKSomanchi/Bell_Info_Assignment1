package assignment1;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean prime = true;
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				prime=false;
				break;			
			}
		}
		
		if(prime){
			System.out.println(+n+" is a prime number.");
		}
		else{
			System.out.println(+n+" is not a prime number.");
		}
		sc.close();
	}

}
