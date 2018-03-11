package com.gl;

public class SetToZero {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 0, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		// System.out.println(a.length);
		int[][] B = setToZero(a, 4);
		for (int i = 0; i < 4; i++) {
			System.out.println();
			for (int j = 0; j < 4; j++) {
				System.out.println(B[i][j]);
			}
		}
	}

	public static int[][] setToZero(int[][] a, int n) {
		int[][] B = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				B[i][j] = a[i][j];
			}
		}

		return changeNum(a, n, B);

	}

	private static int[][] changeNum(int[][] a, int n, int[][] B) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] == 0) {
					int k = i;
					int l = j;
					for (int h = 0; h < n; h++) {
						B[k][h] = 0;
						B[h][l] = 0;
					}
				} 
			}

		}
		return B;
	}

}

/*
 * 1 2 0 4 0 0 0 0 8 9 10
 */

/*
 * Input:
 * 
 * 1 2 3 4 5 6 0 8 9 10 11 12 13 14 15 16
 * 
 * Output: 1 2 0 4 0 0 0 0 9 10 0 12 13 14 0 15
 * 
 */