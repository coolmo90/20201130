package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionExample {

	public static void main(String[] args) {

		Set<Integer> numbers = new HashSet<>();
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		numbers.add(30);
		numbers.add(35);
		numbers.add(40);
		
		numbers.add(20);
		numbers.add(25);

		int sum = 0;
		for (Integer i : numbers) { //인티저 값을 가지고오세요
			sum += i;
		}
		System.out.println("numbers: " + sum);
	}

}
