package com.yedam.generic;

public class Box<T> {
//<T>는 실제 메인메소드를 호출할때	
// Object -> T 로 변경 -> Apple
	T obj; //object 최상위클래스 부모클래스
	void set(T obj) {
		this.obj = obj;
	}
	T get() {
		return obj;
	}
}
