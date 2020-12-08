package com.yedam.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Student {
	private String name;
	private int engScore;
	private int mathScore;
	//생성자후 겟메소드 생성
	public Student(String name, int engScore, int mathScore) {
		super();
		this.name = name;
		this.engScore = engScore;
		this.mathScore = mathScore;
		
	}
	public String getName() {
		return name;
	}
	public int getEngScore() {
		return engScore;
	}
	public int getMathScore() {
		return mathScore;
	}
}


