package com.gl;

public class Solution {
	
	public static void main(String[] args) throws ImproperLengthException, InsufficientArraySizeException {
		int[] arr1 = {2,9,14};
		int[] arr2 = {13,18,-1,-1,-1};
		
		Solution s = new Solution();
		 int[] arr =  s.merge(arr1, arr2);
		 for(int i = 0 ; i < arr2.length; i++) {
			 System.out.println(arr[i]);
			 
		 }

	}

	public  int[] merge(int[] arr1, int[] arr2) throws ImproperLengthException, InsufficientArraySizeException {
		int len1 = arr1.length;
		int len2 = arr2.length;
		int size2 = len2 - len1;

		if (len2 < len1) {			
			throw new ImproperLengthException("Secong array should be of greater length than first array");
			
		}

		for (int i = len2 -1 ; i >= len1; i--) {
			if (arr2[i] != -1) {
				throw new InsufficientArraySizeException(
						"Second array size is insufficient to accommodate the first array");
			}

		}
		for(int  i =0 ; i < len1 ; i++) {
		arr2 =  insert(arr2, 0, size2,  arr1[i]);
		}
		return arr2;

	}

	private int[] insert(int[] a2, int startInd, int endInd, int current) {
		// binary search
		while (startInd <= endInd) {
			int mid = (endInd - startInd) / 2;
			
			System.out.println("Mid value "+ a2[mid]);
			

			// if current element fits between middle and middle +1 th element
			if ((mid ==0 ) || (current >= a2[mid] && current < a2[mid + 1])) {
				//int i1 = mid + 1;
				int j = endInd;
				while (j > startInd + 1) {
					a2[j + 1] = a2[j];
					j--;
				}
				a2[j] = current;

				return a2;
			} else if (current < a2[mid]) {

				return insert(a2, startInd, mid - 1, current);
			} else {

				return insert(a2, mid + 1, endInd, current);

			}

		}
		return a2;

	}

	class ImproperLengthException extends Exception {

		public ImproperLengthException(String message) {
			super(message);
		}
	}

	class InsufficientArraySizeException extends Exception {

		public InsufficientArraySizeException(String message) {
			super(message);
		}
	}

}