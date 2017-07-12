package javaclass;

import java.util.*;
import java.util.Map.Entry;
//program to count occurances of word in a given paragragh.

public class CountWord {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String para[] = new String[1002];
		String a = s.nextLine();
		a = a.toUpperCase();
		para = a.split("\\s+");

		Map<String, Integer> map = new HashMap<String, Integer>();
		//Map<Integer, String> map1 = new HashMap<Integer,String>();
		Set<Map<String,Integer>> s1 = new HashSet<>();
		Map<String,Integer> map1 = new HashMap<>();
		
		for (String word : para) {
			if (map.containsKey(word)) {
				int c = map.get(word);
				map.put(word, c + 1);
				//map1.put(c+1,word);
			} else
			{
				map.put(word, 1);
				//map1.put(1,word);
			}
		}
		List<Integer> list = new ArrayList<>();
		list.addAll(map.values());
		Collections.sort(list,Comparator.reverseOrder());
		
		for(int i:list)
		{
			for(Entry<String, Integer> entry : map.entrySet()) {
				if( i == entry.getValue() ) {
					map1.put(entry.getKey(),i);
					
					
					
				}
				
			}
			
		}
		s1.add(map1);
		System.out.println(s1);
	}
}
