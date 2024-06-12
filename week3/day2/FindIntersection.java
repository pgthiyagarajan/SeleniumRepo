package week3.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int A[] = {3, 2, 11, 4, 6, 7};
		int B[] = {1, 2, 8, 4, 9, 7};
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(A[i]==B[j]) {
					System.out.println(A[i]);
				}
			}
		}
	}

}
