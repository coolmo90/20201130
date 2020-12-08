package com.yedam.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListExample2 {
	public static void main(String[] args) {
		
		System.out.println("Hello".hashCode());
		System.out.println("Hello".hashCode());
		//hashCode 는 어떻게 정해졌냐에 따라 적절하게쓰면댐
		List<String> list = new ArrayList<>();
		list.add(new String("Hellow"));
		list.add(new String("World"));
		list.add("Welcome");
		list.add(new String("Hellow"));

		list.get(1);

		for (int i = 0; i < list.size(); i++) {
			// System.out.println(list.get(i));
		}

		for (String str : list) {
			// System.out.println(str);
		}

		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Hello");
		// set은 중복된값 허용x

		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		for (String str : set) {
			System.out.println(str);
		}
		System.out.println("===================");
		
		Set<Fruit> fruits = new HashSet<>();
		fruits.add(new Fruit("Apple", 1000));
		fruits.add(new Fruit("Banana", 1500));
		fruits.add(new Fruit("Orange", 2000));
		fruits.add(new Fruit("Nanana", 1500));
		// 3개의 인스턴스를 담았다
		// fruits 변수 담을수 있는 인스턴스타입 Fruit 인스턴스
		Iterator<Fruit> fiter = fruits.iterator();
		// 반복자
		while (fiter.hasNext()) {
			Fruit fruit = fiter.next();
			System.out.println(fruit.getName() + "-" + fruit.getPrice());
		}
	}
}