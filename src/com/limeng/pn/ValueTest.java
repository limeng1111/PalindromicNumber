package com.limeng.pn;

public class ValueTest {

	public static void main(String[] args) {
		String a = "test2";
		System.out.println(a.hashCode());
		change(a);
		System.out.println(a);
	}
	
	public static void change(String a) {
		a = a;
		System.out.println(a.hashCode());
	}
}
