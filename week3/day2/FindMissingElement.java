package week3.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int A[]= {1, 2, 3, 4, 10, 6, 8};
		Arrays.sort(A);
		for(int i=0;i<A.length-1;i++) {
			if(A[i]+1 != A[i+1]) {
				for(int j=A[i]+1;j<A[i+1];j++) {
					System.out.println(j+" is one of the missing numbers in the array");
				}
			}
		}

	}

}
