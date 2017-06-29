package assignment6;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scanner.nextInt();
		
		//Two Dimensional TABLE
		System.out.println("****TWO DIMENSIONAL TABLE****");
		for(int i=1;i<=10;i++){
			System.out.println(n+"*"+i+"="+(n*i));
		}
		
		//THREE DIMENSIONAL TABLE
		System.out.println("\n****THREE DIMENSIONAL TABLE****");
		for(int i=1;i<=10;i++){
			for(int j=1;j<=10;j++){
				System.out.println(n+"*"+i+"*"+j+"="+(n*i*j));
			}
			
		}
		
		
		
		//Manual Sorting
		System.out.println("\n****SORTING****");
		System.out.println("HOW many numbers do you want to sort: ");
		int nums = scanner.nextInt();
		int numArray[] = new int[nums];
		System.out.println("Enter Numbers now: ");
		for(int i=0;i<nums;i++){
			numArray[i] = scanner.nextInt();	
		}
		System.out.println("\nNUMBERS ENTERED ARE: ");
		for(int i=0;i<nums;i++){
			System.out.println(numArray[i]);	
		}
		System.out.println("\nNOW SORTING BEGINS...");
		int temp=0;
		for(int i=0;i<numArray.length;i++){
			for(int j=i+1;j<numArray.length;j++){
				if(numArray[j]<numArray[i]){
					temp = numArray[j];
					numArray[j]=numArray[i];
					numArray[i]=temp;
				}
			}
			
		}
		System.out.println("\nSORTED ARRAY...: ");	
		for(int i=0;i<nums;i++){
			System.out.println(numArray[i]);	
		}
		System.out.println("SECOND HIGHEST NUMBER IS..");		
		//for(int i=nums;i<0;i++){
			int len = numArray.length;
			if(numArray[len-2]==numArray[len-2]){
				System.out.println(numArray[len-3]+" at index "+(len-3));
			}
			else{
				System.out.println(numArray[len-2]+" at index "+(len-2));
			}
		//}

	}

}
