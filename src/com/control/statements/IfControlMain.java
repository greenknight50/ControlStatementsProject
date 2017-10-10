package com.control.statements;
public class IfControlMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[] = {82,83,12,92,72};
		int arr1[] = new int[6];
		int[] arr3 = getArray();
		
		System.out.println("arr1[4]: " +arr1[4]);
		System.out.println("arr[2]: " + arr[2]);
		System.out.println("arr length: " +arr.length);
		System.out.println("arr1 length: " +arr1.length);
		System.out.println("arr3 length: " +arr3.length);
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		}
		
		System.out.println("Array elements using for-each loop");
		//int i;
		for (int i : arr) {
			System.out.println("arr["+i+"]: "+i);
		}
		
	}
	
	
	public static int[] getArray() {
		
		//database access
		int arr[] = {23, 56, 73};
		return arr ;
	}

}
