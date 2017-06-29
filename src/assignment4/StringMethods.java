package assignment4;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a java class";
		
		

		// How many words in a String?
		String[] n = s.split("\\s+");
		int words = n.length;
		System.out.println("\nHow many words in a String? " + words);

		// Length of the String?
		System.out.println("\nLength of the String? " + s.length());

		// How many single character words in the String?
		// String[] n = s.split(" ");
		int count = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i].length() == 1) {
				count++;
				System.out
						.println("\nHow many single character words in the String? is/are: "
								+ count
								+ " ,at index "
								+ i
								+ " and the word is, " + n[i]);
			}
		}

		// Reverse each word ?
		System.out.println("\nReverse each word!");
		for (int i = 0; i < n.length; i++) {
			StringBuilder rev = new StringBuilder();
			rev.append(n[i]);
			System.out.println("Word at " + i + "index :" + rev.reverse());
		}

		// Reverse entire String
		System.out.println("\nReverse entire String!");
		StringBuilder rev = new StringBuilder();
		rev.append(s);
		System.out.println("Reversed String: " + rev.reverse());

		// Replace java with SQL
		System.out.println("\nReplace java with SQL!");
		System.out.println(s.replaceAll("java", "SQL"));
		// System.out.println(s.replaceFirst("java", "SQL"));

		// Letter at the center
		System.out.println("\nLetter at the center");
		int center = 0;
		if (s.length() % 2 == 0) {
			center = (s.length() / 2);
		} else {
			center = ((s.length() + 1) / 2);
		}
		String d = s.replaceAll(" ", "");
		;
		// System.out.println(d + " " + s);
		char[] c = d.toCharArray();
		System.out.println("Center letter is : " + c[center]);

		// Index of j at center
		System.out.println("\nLetter at the center :" + center);

		// Number of times each letter repeated
		
		System.out.println("\nNumber of times each letter repeated && identify a letter which is not repeated.");
		for (int i = 0; i < d.length(); i++) {
			int sum = 0;
			for (int j = 0; j < d.length(); j++) { // if j = i+1, then we can
													// count all except the
													// original
				if (d.charAt(i) == d.charAt(j)) {
					sum++;
				}

			}
			System.out.println("\nNumber of times repeated = " + (sum)
					+ " at index of " + i + " and the repeated letter is :"
					+ d.charAt(i));
			if (sum == 1) {
				System.out.println("This letter is not repeated = "
						+ d.charAt(i));
			}

		}
		
		
		
		
		
	
		
		
		//Identify the index of each word
		for(int i=0;i<n.length;i++){
			
			System.out.println("Index OF: "+n[i]+" in Given String \'s\' is "+s.indexOf(n[i]));
		}
		
		
		//String in UPPERCASE
		System.out.println("\nSTRING IN UPPERCASE: "+s.toUpperCase());
		
		
		System.out.println(s.indexOf("j")+s.substring(19, 20));
		
	}
}
