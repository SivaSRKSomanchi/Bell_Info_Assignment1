package assignment9;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class NonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sivas";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] letters = s.toCharArray();
		for(char c:letters){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		char[] result = new char[s.length()];
		int i=0;
		Set<Character> set = map.keySet();
		for(Character c:set){
			if(map.get(c)<2){
				//System.out.println(c);
				result[i]=c;
				i++;
				
			}
		}
		System.out.println(result[0]+" is first non repeated");
	}

}
