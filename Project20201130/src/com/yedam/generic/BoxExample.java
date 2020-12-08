package com.yedam.generic;


import java.util.ArrayList;
import java.util.List;


class Apple {

}

public class BoxExample {
	public static void main(String[] args) {
//		Box box = new Box();
//		box.set("Hello");
//		String str = (String) box.get();
//
//		box.set(new Integer(10));
//		Integer num1 = (Integer) box.get();
//
//		box.set(new Apple());
//		str = (String) box.get();//에러뜸-박스의 인스턴스가 apple인스턴슨데
//								//String 이라선
//		//Apple apple = (Apple) box.get();
//		//할때마다 (String) (Integer) 추가로 넣어서 변형시켜줘야함
//
//		System.out.println("end");
	
		Box<String> box = new Box<String>();
		String str = box.get(); //내용출력이아니라 박스안이 스트링타입이구나
		
		Box<Apple> apple = new Box<Apple>();
		Apple app = apple.get();
		System.out.println("end");
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		
		List<Apple> applist = new ArrayList<>();
		applist.add(new Apple());
	}
}
