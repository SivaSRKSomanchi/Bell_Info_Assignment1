package assignment9;

import java.util.Scanner;

public class StockSellandBuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("The Stock Values of last during n days..");
		System.out.println("How many days values you want to enter..");
		int n = scan.nextInt();
		System.out.println("Enter " + n + " Stock Values.. ");
		int stockValues[] = new int[n];
		for (int i = 0; i < n; i++) {
			stockValues[i] = scan.nextInt();
			if (n - i - 1 == 0) {
				System.out
						.println("Done. Thank You. Your Stock Values are here..");
			} else {
				System.out.println(n - i - 1
						+ "remaining..Please Enter rest of the values");
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(stockValues[i]);
		}
		System.out.println(maxProfit5(stockValues));
//		double min = stockValues[0];
//		int k = 0;
//		for (int i = 0; i < n; i++) {
//			if (stockValues[i] < min) {
//				min = stockValues[i];
//				k = i;
//			}
//		}
//		System.out.println("Minimum value is " + min + " on " + k);
//		double max = stockValues[0];
//		int k1 = 0;
//		for (int i = 0; i < n; i++) {
//			if (stockValues[i] > max) {
//				max = stockValues[i];
//				k1 = i;
//			}
//		}
//		System.out.println("Maximum value is " + max + " on " + k1);
//		if (k1 > k) {
//			System.out.println("Maximum gain: "
//					+ (stockValues[k1] - stockValues[k]));
//		} else {
//			System.out.println("Dates mismatched.."); }
	
	}
	
	public static int maxProfit5(int[] array) {
	    if(array == null || array.length < 2){
	        return 0;
	    } 
	    int maxProfit = 0;
	    for(int i = 0; i < array.length-1; i++){
	        for(int j = i+1; j < array.length; j++){
	            if(array[j] > array[i] && maxProfit < array[j] - array[i]){
	                maxProfit = array[j] - array[i];
	            }
	        }
	    }
	    return maxProfit;
	}
}
