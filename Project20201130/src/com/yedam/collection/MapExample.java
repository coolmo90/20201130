package com.yedam.collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//741page

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
			//key    //value
		map.put("Hong", 15);
		map.put("Hwang", 20);
		map.put("Hong", 25);
		
		Integer val = map.get("Hong");
		System.out.println(val);
		
		
		// 1. keySet()
		// 2. entrySet()
		
		
		Map<Integer, String> mapInt = new HashMap<>();
		mapInt.put(10, "김다현");
		mapInt.put(20, "이혜빈");
		mapInt.put(30, "이나경");
		String result = mapInt.get(10);
		System.out.println(result);
		
		Set<Integer> set = mapInt.keySet();
		for (Integer num : set) {
			System.out.println("key: " + num + ", val:" + mapInt.get(num));
									   //key값
		}
	
		Set<Entry<Integer, String>> entrySet = mapInt.entrySet();
		   //중첩
		for (Entry<Integer, String> ent : entrySet) {
			System.out.println("key: " + ent.getKey() + ", val: " + ent.getValue());
		}
	
	}		
}