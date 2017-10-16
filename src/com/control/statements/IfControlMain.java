package com.control.statements;

public class IfControlMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// int arr[] = { 82, 83, 12, 92, 72 };
		int arr[][] = { { 2, 4, 34, 32 }, { 54, 91, 10, 19 }, { 43, 64, 29, 20 } };
		int arr1[][] = new int[2][3];

		arr1[0][0] = 19;
		arr1[0][1] = 20;
		arr1[0][2] = 38;

		arr1[1][0] = 43;
		arr1[1][1] = 83;
		arr1[1][2] = 50;

		int[] arr3 = getArray();

		System.out.println("arr[2][1]: " + arr[2][1]);
		System.out.println("arr1[0][1]: " + arr1[0][1]);
		System.out.println("arr[2] length: " + arr[2].length);
		System.out.println("arr1 length: " + arr1.length);
		System.out.println("arr3 length: " + arr3.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}

		System.out.println("Array elements using for-each loop");
		// int i;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "]: " + arr[i][j]);
			}
		}

	}

	public static int[] getArray() {

		// database access
		int arr[] = { 23, 56, 73 };
		return arr;
	}

}
