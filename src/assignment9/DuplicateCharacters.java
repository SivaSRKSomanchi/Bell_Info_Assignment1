package assignment9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "SivaRammn   ";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] letters = s.toCharArray();
		for(char c:letters){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		Set<Character> set = map.keySet();
		for(Character c:set){
			if(map.get(c)>1){
				System.out.println(c+" repeated for "+map.get(c));
			}
		}
	}

}
