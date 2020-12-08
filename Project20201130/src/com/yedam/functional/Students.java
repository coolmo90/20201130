package com.yedam.functional;

//701p Student -> Students 로 같은 클래스 이미 만들어져있어서 
public class Students {
	private String name;
	private String sex;
	private int score;

	public Students(String name, String sex, int score) {
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	public String getSex() {
		return sex;
	}

	public int getScore() {
		return score;
	}

}