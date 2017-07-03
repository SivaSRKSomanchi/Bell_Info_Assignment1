package assignmentClassJuly2nd;


import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class PerformaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1000000;
		List<String> arrList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		creatingSize(arrList, num);
		creatingSize(linkedList, num);
		System.out
				.println("Insetion of Elements: LinkedList has better performance than ArrayList.");
		insertion(arrList, num);
		insertion(linkedList, num);
		System.out
				.println("\nSearch/Access time for ArrayList: O(1). \nAccess time for LinkedList: O(n)");
		System.out
				.println("In an array, you can access to any element by using array[index], while in a linked list you must navigate \nthrough all the list starting from first until you get the element you need.");

		search(arrList, num);
		search(linkedList, num);
		System.out
				.println("\nDeletion Time is less for linked List. It just traverse through the list and deletes the specific node there");
		System.out
				.println("While in ArrayList, it has to create duplicate array and deletes the required \nelement there and then merge the rest of the part.");
		delete(arrList, num);
		delete(linkedList, num);

	}

	static void creatingSize(List<String> l, int num) {
		for (int i = 0; i < num; i++) {
			l.add("" + i);
		}
	}

	private static void insertion(List<String> l, int num) {
		long initialTime;
		long finalTime;
		Random r = new Random();
		int n = r.nextInt(10000);
		initialTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			l.add(n, " Somanchi ");
		}
		finalTime = System.currentTimeMillis();
		System.out.println("Insertion Time of " + l.getClass() + " is "
				+ ((finalTime - initialTime) )+ " MilliSeconds");
	}

	private static void search(List<String> l, int num) {
		long initialTime;
		long finalTime;
		
		Random r = new Random();
		int n = r.nextInt(10000);
		initialTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			l.get(n);
		}
		finalTime = System.currentTimeMillis();
		System.out.println("Search Time of " + l.getClass() + " is "
				+ (finalTime - initialTime) + " MilliSeconds");
	}

	private static void delete(List<String> l, int num) {
		long initialTime;
		long finalTime;
		Random r = new Random();
		int n = r.nextInt(10000);
		initialTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			l.remove(n);
		}
		finalTime = System.currentTimeMillis();
		System.out.println("Deletion Time of " + l.getClass() + " is "
				+ ((finalTime - initialTime))+" MilliSeconds" );
	}

}
