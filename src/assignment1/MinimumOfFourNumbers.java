package assignment1;

import java.util.Scanner;

public class MinimumOfFourNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arary = new int[4];
		int minNum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 Numbers:");
		for (int i = 0; i < 4; i++) {
			arary[i] = sc.nextInt();
		}
		minNum = arary[0];
		for (int i = 1; i < 4; i++) {
			if (arary[i] < minNum) {
				minNum = arary[i];

			}

		}
		System.out.println("Mininum of four numbers is: " + minNum);
		System.out.println("Sorted Array");
		int[] sort = arary;
		int temp = sort[0];
		for (int i = 0; i < sort.length - 1; ++i) {
			for (int j = 0; j < sort.length - 1; ++j) {
				if (sort[j] > sort[j + 1]) {
					temp = sort[j];
					sort[j] = sort[j + 1];
					sort[j + 1] = temp;

				}

			}
		}

		for (int i = 0; i < sort.length; ++i) {
			System.out.println(sort[i]);
		}
		sc.close();
	}

}
