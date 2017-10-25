package com.control.statements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCollectionMain {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Hyderabad");
		list.add("Chicago");
		list.add("Atlanta");
		list.add("Delhi");
		list.add(2, "delhi");
		
		System.out.println("List elements before removing: " + list);
		System.out.println("Does list contain Hyderabad? :" + list.contains("Hyderabad"));
		int delhiIndex = list.indexOf("Delhi");
		System.out.println("\"D\": " + (int)'D');
		System.out.println("\'d\': " + (int)'d');
		System.out.println("Delhi's index: " + delhiIndex);
		//list.remove(1);
		//list.remove("Delhi");
		//System.out.println("List elements after removing: " + list);

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(45);
		intList.add(70);
		intList.add(4);
		intList.add(91);
		intList.add(23);
		intList.add(53);
		intList.add(32);
		System.out.println("List before sorting: " + intList + ", \n" + list);
		Collections.sort(intList);
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println("List after sorting: " + intList + ", \n" + list);
		List<Integer> sublist = intList.subList(1, 5);
		System.out.println("Sublist before= " + sublist);
		sublist.remove(2);
		System.out.println("Original list after: " +intList + "\nSublist after: " + sublist);
		//sublist.remove(2);
		//System.out.println("Original list: " +intList + "\nSublist: " + sublist);
	}

}
