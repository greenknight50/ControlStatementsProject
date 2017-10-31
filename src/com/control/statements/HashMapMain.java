package com.control.statements;

import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(5, "Five");
		hashMap.put(100, "Hundred");
		hashMap.put(20, "Twenty");
		hashMap.put(6, "Five");
		hashMap.put(null, "NullValue");
		System.out.println("Value: " + hashMap.get(null));
	}

}
