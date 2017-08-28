package com.limeng.pn;

public class SubClassTest extends SuperClassTest{
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		SuperClassTest classTest = new SuperClassTest();
		System.out.println(classTest.age);
	}
}
