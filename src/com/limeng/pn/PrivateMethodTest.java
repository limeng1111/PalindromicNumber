package com.limeng.pn;

import java.util.ArrayList;
import java.util.List;

public class PrivateMethodTest {

	/***
	 * 基础数据类型在方法间传递与对象在方法间传递之间的区别
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;
		List<String> result = new ArrayList<String>();
		result.add("1");
		result.add("2");
		result.add("3");
		i = add(result, i);
		JsonTest.add(result);
		System.out.println("result size "+result.size());
		System.out.println("i = "+i);
	}
	
	public static int add(List<String> result, int i) {
		result.add("4");
		return ++i;
	}
}
