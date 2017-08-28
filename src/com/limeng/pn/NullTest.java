package com.limeng.pn;

import java.util.List;

public class NullTest {

	public static void main(String[] args) {
		List<String> list = null;
		for (String string : list) {
			System.out.println(string);
		}
	}
}
