package assignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.collections4.map.HashedMap;

public class Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(20);
		arrayList.add(100);
		arrayList.add(13);
		
		//2)Find Minimum element of Java ArrayList Example
		System.out.println("Minimum element of Java ArrayList Example: "+Collections.min(arrayList));
		
		//3)Find Minimum element of Java HashSet Example
		Set set = new HashSet();
		set.add(11);
		set.add(100);
		set.add(7000);
		set.add(212);
		set.add(90);
		List arrayList1 = new ArrayList(set);
		Collections.sort(arrayList1);
		System.out.println("Minimum element of Java HashSet Example: "+Collections.min(arrayList1));
		
		//4)Reverse order of all elements of Java ArrayList Example
		System.out.println("Original Order of ArrayList..");
		for(Integer l:arrayList){
			System.out.println(l);
		}
		Collections.reverse(arrayList);
		System.out.println("Reverse order of all elements of Java ArrayList Example: ");
		for(Integer l:arrayList){
			System.out.println(l);
		}
		
		//5)Check if a particular key exists in Java HashMap example
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		map.put('c', 1);
		map.put('d', 2);
		System.out.println("Checking Particular Key(character c) exist in HashMap or Not..");
		System.out.println("map.containsKey('c') ..? : "+map.containsKey('c'));
		//6)Check if a particular value exists in Java HashMap example
		System.out.println("Checking Particular Value(character c's value) exist in HashMap or Not..");
		System.out.println("map.containsValue(map.get(1)) ..? : "+map.containsValue(1));
		
		//7)Get lowest and highest key stored in Java TreeMap example
		TreeMap<Character,Integer> tmap = new TreeMap<Character, Integer>();
		tmap.put('x', 1);
		tmap.put('d', 2);
		tmap.put('t', 8);
		tmap.put('a', 9);
		Set<Character> tset = tmap.keySet();
		System.out.println("Irrespective to Insertion Order.. Keys are sorted in natural order, automatically in TreeMap..");
		for(Character s:tset){
			System.out.println(s + "==>"+ tmap.get(s));
		}
		System.out.println("Lowest key stored in Java TreeMap example: "+tmap.firstKey());
		System.out.println("Higest key stored in Java TreeMap example: "+tmap.lastKey());
		 
	}

}
