package com.yedam.collection;

public class Fruit {
	private String name;
	private int price;

	private Fruit() {

	}

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
		// 초기값을 제공해주는 생성자 만들기
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		return super.hashCode();
		return this.name.length() + this.price;
	}					//hashCode

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
	Fruit fruit = (Fruit) obj;
		boolean b1 = this.name.length() == fruit.name.length();
	boolean b2 = this.price == fruit.price;
	return b1 && b2;
//		Object obj => Fruit 클래스로 casting	

			// return super.equals(obj);
	}
}
//위 마지막 return값 밑에걸로도 가능

//Fruit fruit = (Fruit) obj;
//return this.name.equals(fruit.name) && this.price == fruit.price;


//boolean b1 = this.name.equals(fruit.name);
//boolean b2 = this.price == fruit.price;
//return b1 && b2;