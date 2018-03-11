package com.gl;



/*Rotate Image – N*N matrix
e.g. Input -> 
 1 2 3 4
5 6 7 8
9 10 11 12                               
13 14 15 16

Output ->
13 9 5 1
14 10 6 2
15 11 7 3
16 12 8 4
Input - 
0,0      0,1       0,2       0,3                                  3,0    2,0      1,0   0,0          
1,0      1,1       1,2       1,3                                  3,1    2,1      1,1   0,1
2,0      2,1       2,2       2,3               -->                3,2    2,2      1,2   0,2
3,0      3,1       3,2       3,3                                  3,3    2,3      1,3   0,3
  
For (int I =0 ; I < n ; i++){
 For(int j = 0; j < n; j++){
B[i][j] = a[n-j -1][i];
}
}*/

// cbtnuggets.com

public class RotateImage {

	public static void main(String[] args) {
		int[][] a = {{1,2,3,4}, 
					{5,6,7,8},
					 {9,10,11,12},
					 {13,14,15,16}};
		
		System.out.println(rotate(a,4));
	}

	public static int[][] rotate(int[][] a, int n) {

		int[][] b = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//System.out.println("i = "+ i);
				//System.out.println("j = "+ j);
				b[i][j] = a[n - j-1][i];
				//System.out.println("b[i][j] = "+ b[i][j]);
			}

		}
		return b;
	}
	

	public static int[][] rotate2(int[][] a, int n) {

		int[][] b = new int[n][n];
		int i = 0 , j =0;
		
		// Need to improve performance
		while(i < n) {
			b[i][j] = a[n-j-1][i];
		}
		return b;
	}

}