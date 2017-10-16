package com.control.statements;

public class IfControlMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][][] marks = new int[3][3][3];
		System.out.println("marks length: " + marks.length);
		System.out.println("Element at marks[0][0][0]: " + marks[0][0][0]);
		marks[0][0][0] = 11;
		marks[0][0][1] = 12;
		marks[0][0][2] = 13;
		marks[0][1][0] = 14;
		marks[0][1][1] = 15;
		marks[0][1][2] = 16;
		marks[0][2][0] = 17;
		marks[0][2][1] = 18;
		marks[0][2][2] = 19;

		marks[1][0][0] = 21;
		marks[1][0][1] = 22;
		marks[1][0][2] = 23;
		marks[1][1][0] = 24;
		marks[1][1][1] = 25;
		marks[1][1][2] = 26;
		marks[1][2][0] = 27;
		marks[1][2][1] = 28;
		marks[1][2][2] = 29;

		marks[2][0][0] = 31;
		marks[2][0][1] = 32;
		marks[2][0][2] = 33;
		marks[2][1][0] = 34;
		marks[2][1][1] = 35;
		marks[2][1][2] = 36;
		marks[2][2][0] = 37;
		marks[2][2][1] = 38;
		marks[2][2][2] = 39;

		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j++) {
				for (int k = 0; k < marks[i][j].length; k++) {
					System.out.println("marks[" + i + "][" + j + "][" + k + "]: " + marks[i][j][k]);
				}
				System.out.println();
			}
			System.out.println("End of upper most loop.\n");
		}

	}

}
