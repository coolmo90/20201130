package com.yedam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample2 {
	public static void main(String[] args) {
		Set<Person> persons = new HashSet<>();
		persons.add(new Person("Hong"));
		persons.add(new Person("Hwang"));
		persons.add(new Person("Park"));
		persons.add(new Person("Hong"));
		// 같은 Hong이지만 인스턴스 메모리값은 달라서
		// 중복이 아닌걸로 뜸 이런 메모리주소에(Person@74650e52)  
		
		//이름이 같으면 같은값을 보고싶다
		//Person 클래스에 Ovveride의 return 값변경
		// 아래 Person 클래스 내용 수정변경
//		@Override // Override 부모꺼가져오겠다 //super 부모클래스
//		public int hashCode() {
//			// TODO Auto-generated method stub
//			
//		// return super.hashCode();
//		//	return 10;
//			return this.name.hashCode();
//		}
//
//		@Override
//		public boolean equals(Object obj) {
//			// TODO Auto-generated method stub
//
//		//return super.equals(obj);
//			Person p = (Person) obj;
//			boolean result = this.name.equals(p.name);
//			return true;
//		}
		
		Iterator<Person> iter = persons.iterator();
		while (iter.hasNext()) {
			Person person = iter.next();
			System.out.println(person);
		
		
		}

	}
}
