package org.example.ex;

public class Ex02 {
	private int a;

	public Ex02() {
		var b = 20;
		int c = 30;
		int d;

		Integer f =20;

		callFunction(a);
		callFunction(b);
		callFunction(c);
		callFunction(f);
	}

	public void callFunction(Integer i) {
		var temp = (i==null ? "null값 입니다.":i);
		System.out.println(i);
		System.out.println(temp);
	}

	public static void main (String[] args) {
		new Ex02();
	}
}
