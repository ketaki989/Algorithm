package Array;
import java.util.*;
public class MaximumOccurChar {
	public static HashMap<Character, Integer> maxOccurchar(String str){
		int max = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0 ; i < str.length(); i++){
			char c = str.charAt(i);
			if(map.containsKey(c)){
				int count = map.get(c);
				count++;
				if(max < count){
					max = count;
				}
				map.put(c, count);
			}else{
				map.put(c, 1);
			}
		}
		
		Set<Character> set = map.keySet();
		char key ='\0';
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		Iterator<Character> iterator = set.iterator();
		while(iterator.hasNext()){
			key = iterator.next();
			if(map.get(key) == max){
				hmap.put(key, max);
			}
		}
		return hmap;
	}
	public static void main(String args[]){
		String str = "GoodMorning Mumbai";
		System.out.println(maxOccurchar(str));
	}
}
