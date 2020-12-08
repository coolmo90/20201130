package com.yedam.functional;

import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;
import java.util.function.BiConsumer;

public class ConsumerExample {
	public static void main(String[] args) {

		Consumer<String> consumer = null;

		consumer = t -> System.out.println("Hello " + t);

		consumer.accept("Hello");
		consumer.accept("Hwang");

		BiConsumer<String, Integer> biCon = null;
		biCon = (t, u) -> System.out.println("이름은 " + t + ", 나이는 " + u);
		biCon.accept("Hong", 15);

		ObjIntConsumer<String> objIntCon = null;
		objIntCon = new ObjIntConsumer<String>() {

			@Override
			public void accept(String t, int value) {
				System.out.println("이름은 " + t + ",나이는" + value);
			}
		};
		objIntCon.accept("Hwang", 88);
	}

}

//ObjIntConsumer<String> objIntCon = null;
//objIntCon =(t, value) -> System.out.println("이름은 " + t + ", 점수는 " + value);
//
//objIntCon.accept("Hwang", 88);