package assignmentClassJuly2nd;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class PerformanceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HashSet vs. TreeSet vs. LinkedHashSet");
		System.out.println("Performance Testing..");

		HashSet<Laptop> hash = new HashSet<Laptop>();
		TreeSet<Laptop> tree = new TreeSet<Laptop>();
		LinkedHashSet<Laptop> linkedHash = new LinkedHashSet<Laptop>();

		System.out
				.println("HashSet gives better performance than the LinkedHashSet and TreeSet.");
		System.out
				.println("O(1) for insertion, removal and retrieval operations.");
		Random r = new Random();
		int index;// = r.nextInt(100000);
		long start = System.currentTimeMillis();
		for (int i = 0; i < 2000; i++) {
			index = r.nextInt(100000);
			hash.add(new Laptop(index));
		}
		long end = System.currentTimeMillis();
		System.out.println("Insertion Time of " + hash.getClass() + " is "
				+ ((end - start)) + " MilliSeconds");

		System.out
				.println("\nTreeSet gives less performance than the HashSet and LinkedHashSet as it has to \nsort the elements after each insertion and removal operations.");
		System.out
				.println("O(log(n)) for insertion, removal and retrieval operations.");
		start = System.currentTimeMillis();
		for (int i = 0; i < 2000; i++) {
			index = r.nextInt(100000);
			tree.add(new Laptop(index));
		}
		end = System.currentTimeMillis();
		System.out.println("Insertion Time of " + tree.getClass() + " is "
				+ ((end - start)) + " MilliSeconds");

		System.out
				.println("\nThe performance of LinkedHashSet is almost similar to HashSet. \nBut slightly slow as it maintains LinkedList internally to maintain the insertion order of elements.");
		System.out
				.println("Here also, O(1) for insertion, removal and retrieval operations.");
		start = System.currentTimeMillis();
		for (int i = 0; i < 2000; i++) {
			index = r.nextInt(100000);
			linkedHash.add(new Laptop(index));
		}
		end = System.currentTimeMillis();
		System.out.println("Insertion Time of " + linkedHash.getClass()
				+ " is " + ((end - start)) + " MilliSeconds");
	}

}

class Laptop implements Comparable<Laptop> {
	int screenSize;

	public Laptop(int size) {
		screenSize = size;
	}

	public String toString() {
		return "Size is " + screenSize;
	}

	@Override
	public int compareTo(Laptop o) {
		// TODO Auto-generated method stub
		return screenSize - o.screenSize;
	}
}