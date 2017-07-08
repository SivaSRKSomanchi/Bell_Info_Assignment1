package assignment9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MorethanOneDuplicate {

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
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int c:arrayNums){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		Set<Integer> set = map.keySet();
		for(int c:set){
			if(map.get(c)>1){
				System.out.println();
				System.out.println(c+" repeated for "+map.get(c)+" times.");
			}
		}
	}

}
