package week3.day2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int A[] = {3, 2, 11, 4, 6, 7};
		Arrays.sort(A);
		int size = A.length;
		System.out.println(A[size-2]);

	}

}
