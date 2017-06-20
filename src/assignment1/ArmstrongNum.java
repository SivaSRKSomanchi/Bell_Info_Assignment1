package assignment1;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenNum;
		double sum=0.0, digits = 0.0;
		double rem=0.0;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in); 
		givenNum = sc.nextInt();
		 
		int replica=givenNum;
		
		while(replica!=0){
			digits++;       // num of digits of given number
			replica/=10;
		}
		
		
		System.out.println(digit);
		
		/* double digit = (Math.floor(Math.log10(givenNum))) + 1; 
		 * OR
		 * double digit = (int)Math.log10(givenNum)+1;
		 * NUM OF DIGITS OF GIVEN NUMBER -DIFFERENT WAYS */
		
		
		replica = givenNum;
		
		while(givenNum!=0){
			rem=givenNum%10;
			sum = sum + Math.pow(rem, digit);
			givenNum =givenNum/10;			
		}
		System.out.println();
		if(replica==sum){
			System.out.println("Number is Armstrong");
		}
		else{
			System.out.println("Number is not an ArmstrongNumber");	
		}
		sc.close();

	}

}
