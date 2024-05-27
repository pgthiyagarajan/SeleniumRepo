package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={1,4,3,2,8,6,7};
		Arrays.sort(array);
		int arraylen=array.length;
		for(int i=0;i<arraylen;i++)
		{
			if(array[i]!=i+1) {
				System.out.println("The missing number is "+(i+1));
				break;
			}
		}
	}

}
