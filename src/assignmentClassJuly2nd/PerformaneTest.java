package assignmentClassJuly2nd;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class PerformaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 500000;
		List<String> arrList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		insertion(arrList,num);
		insertion(linkedList,num);
		System.out.println("\n");
		search(arrList, num);
		search(linkedList, num);
		System.out.println("\n");
		delete(arrList, num);
		delete(linkedList, num);
	
	
	}
	private static void insertion(List<String> l, int num){
		long initialTime;
		long finalTime;
		initialTime = System.currentTimeMillis();
		for(int i=0;i<num;i++){
			l.add(i, " Somanchi ");
		}
		finalTime = System.currentTimeMillis();
		System.out.println("Insertion Time of "+l.getClass()+" is "+(finalTime-initialTime));
	}
	private static void search(List<String> l, int num){
		long initialTime;
		long finalTime;
		initialTime = System.currentTimeMillis();
		for(int i=0;i<num;i++){
			l.get(i);
		}
		finalTime = System.currentTimeMillis();
		System.out.println("Search Time of "+l.getClass()+" is "+(finalTime-initialTime));
	}
	
	private static void delete(List<String> l, int num){
		long initialTime;
		long finalTime;
		initialTime = System.currentTimeMillis();
		for(int i=0;i<5000;i++){
			l.remove(i);
		}
		finalTime = System.currentTimeMillis();
		System.out.println("Deletion Time of "+l.getClass()+" is "+(finalTime-initialTime));
	}
	
	
  
}

