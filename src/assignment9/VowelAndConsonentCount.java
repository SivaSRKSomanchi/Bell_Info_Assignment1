package assignment9;

import java.util.Scanner;

public class VowelAndConsonentCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String .. ");
		String s = scanner.next();
		int vowelCount=0;
		int consonentCount=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'){
				vowelCount++;
			}else{
				consonentCount++;
			}
		}
		System.out.println("Vowel Count = "+vowelCount);
		System.out.println("Consonent Count = "+consonentCount);

	}

}
