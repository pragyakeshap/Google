package com.gl;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] a = {1,1,2,3,3,3,4,5,6,7,7,7,8};
		int[] b = new int[a.length];
		int l =a.length ;
		
		
	//	for(int i =0; i < a.length ; i++) {
		int i = 0;
		int j = 0;
		while( i < l && j < l) {
			if(i == (l-1)) {
				
			}
			
			if(a[i] != a[i+1] ) {
				b[j] = a[i];
				j++;
				i++;
			}else {
				i++;
			}
		}

		for(int k = 0 ; k < j; k++) {
			System.out.println(b[k]);
		}
	}

}
