package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World1");
		set.add("World2");
		set.add("Welcome");

//		for (String str : set) {
//			System.out.println(str);
//		} 

		// set - 중복된값 허용 안함
		
		
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			// has NExt 주머니안에 5개가 있으면 1개를 끄집어내올게 있냐 물어보는거 값이 참이면 요소가있다
			// 없는요소 - 에러 , next가 2개면 2개가져옴
			String str = iter.next();
//			System.out.println(str); 밑에거나 이거나 같음
			System.out.println(iter.next());
		}

		Set<Integer> numbers = new HashSet<>();
		numbers.add(13);
		numbers.add(26);
		numbers.add(38);
		
		numbers.remove(26);
		
		int sum = 0;
		for (Integer i : numbers) { //인티저 값을 가지고오세요
			sum += i;
		}
		System.out.println("numbers: " + sum);
	}

}
