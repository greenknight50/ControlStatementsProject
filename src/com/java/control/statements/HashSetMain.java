package com.java.control.statements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetMain {

	public static void main(String[] args) {
		
		HashSetMain obj = new HashSetMain();
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Hyderabad");
		arrayList.add("Chicago");
		arrayList.add("New York");
		
		Set<String> hashSet = new HashSet<String>(20, 0.50F);
		hashSet.add("Hyderabad");
		hashSet.add("Hitech city");
		hashSet.add("Chicago");
		hashSet.add("Atlanta");
		hashSet.add("Bloomington");
		hashSet.add(null);
		hashSet.add(null);
		hashSet.add("Chicago");
		System.out.println("GetClass: " +hashSet.getClass() + ", getClass of obj: " + obj.getClass());
		System.out.println("hashset elements: " + hashSet);
		System.out.println("hashset contains all elements? " + hashSet.containsAll(arrayList));
		
		//default growth factor = 0.75
		//16
	}

}
