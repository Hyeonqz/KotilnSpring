package org.example.ex;

public class Ex01 {

	public Ex01 () {
		// 코드 작성
		String name = "홍길동";
		System.out.println(name);
		System.out.println("사용자의 이름은 : %s".formatted(name));
		int age = 10;
		Integer age1 = 20;

		double d = 10d;
		Double _d = 20.0;

		float f = 10f;
		Float _f = 1f;

		long l = 10;
		Long _l = 10L;

		boolean b = true;
		Boolean _b = true;

		// Java -> Primitive Type 과 Wrapper 타입 존재
		// Primitive 는 default 값이 필요하다.
		// Wrapper 는 default 값이 필요없다. 즉 Null 이 허용된다 (불변객체) 이다.
	}

	public static void main (String[] args) {
		new Ex01();
	}
}
