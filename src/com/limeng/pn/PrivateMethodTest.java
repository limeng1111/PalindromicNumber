package com.limeng.pn;

import java.util.ArrayList;
import java.util.List;

public class PrivateMethodTest {

	/***
	 * �������������ڷ����䴫��������ڷ����䴫��֮�������
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
