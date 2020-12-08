package com.yedam.collection;

public class Person extends Object {
	private String name;

	public Person(String name) {
		this.name = name;

	}

	public String getName() {
		return this.name;
	}

	@Override // Override 부모꺼가져오겠다 //super 부모클래스
	public int hashCode() {
		// TODO Auto-generated method stub
		
	// return super.hashCode();
	//	return 10;
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

	//return super.equals(obj);
		Person p = (Person) obj;
		boolean result = this.name.equals(p.name);
		return true;
	
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
