package com.limeng.pn;

import java.util.ArrayList;
import java.util.List;

public class JsonTest {

	public static void main(String[] args) {
		MomentsVOForm form = new MomentsVOForm();
		List<String> types = new ArrayList<String>();
		types.add("lesson");
		types.add("match");
		types.add("training");
		form.setTypes(types);
		
		System.out.println("test");
	}
	
	public static void add(List<String> result) {
		result.add("5");
	}
	
	public static void jsonParse() {
		
	}
}
