package com.yedam.functional;

//p718 - 5번문제
import java.security.DomainCombiner;
import java.util.function.IntBinaryOperator;

public class LambdaExample {
	static int[] scores = { 10, 50, 3 };

	static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int num : scores) {
			System.out.println(result + "," + num);
			result = operator.applyAsInt(result, num);

		}
		return result;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				if (left > right) {
					return left;
				} else {
					return right;

				}

			}

		});

		// 최소값 얻기
		int min = maxOrMin((left, right) -> {
			int result = 0;
			if (left > right) {
				result = left;
			} else {
				result = right;
			}
			return result;
		});
	}
}