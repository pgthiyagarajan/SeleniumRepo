package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String A[] =  {"HCL", "Wipro", "Aspire Systems", "CTS"};
		System.out.println("The array before sorting is ");
		System.out.println(A);
		List<String> rsort = new ArrayList<String>(Arrays.asList(A));
		Collections.sort(rsort);
		System.out.println("The sorted array is ");
		System.out.print(rsort);
		System.out.println("The reverse of this array is...\n");
		for(int i=rsort.size()-1;i>=0;i--) {
			System.out.println(rsort.get(i));
		}

	}

}
