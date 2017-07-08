package assignment9;

import java.util.Scanner;

public class MostRepeatedNuminArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many values you want to enter..");
		int n = scan.nextInt();
		System.out.println("Enter " + n + " Values.. ");
		int arrayNums[] = new int[n];
		for (int i = 0; i < n; i++) {
			arrayNums[i] = scan.nextInt();
		}
		System.out.println("Here are the numbers in an Array.");
		for (int i = 0; i < n; i++) {
			System.out.print(arrayNums[i]+" ");
		}
		int resultVal=0,resultFinal=0,indexCount=0,maxIndexCount=0;
		for(int i=0;i<n;i++){
			resultVal = arrayNums[i];
			indexCount=0;
			for(int j=0;j<n;j++){
				if(arrayNums[i]==arrayNums[j]){
					indexCount++;
				}
				if(indexCount>maxIndexCount){
					maxIndexCount=indexCount;
					resultFinal = resultVal;
				}
			}
		}
		System.out.println("\nMost repeated num is "+resultFinal+ " for "+maxIndexCount+" times.");
		
	}
}




//		int len = arrayNums.length;
//		// Iterate though input array, for every element
//        // arr[i], increment arrayNums[arrayNums[i]%len] by len
//		 for (int i = 0; i< n; i++){
//	            arrayNums[(arrayNums[i]%len)] += len;
//		 }
//		 System.out.println("After incrementing 'arrayNums[arrayNums[i]%len]' by 'len'..");
//		 for (int i = 0; i < n; i++) {
//				System.out.print(arrayNums[i]+" ");
//			}
//		 int c=arrayNums[0];
//		 int index = 0;
//		for(int i=0;i<n-1;i++){
//				if(arrayNums[i]>c){
//					c=arrayNums[i];
//					index=i;
//				}
//			}
//			System.out.println("\nMost Repeated Num is : "+arrayNums[index]+" for "+index+" times.");
		
	