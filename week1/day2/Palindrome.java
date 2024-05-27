package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,sum=0;
		int n=121;
		
		for(int temp =n; temp>0; temp=temp/10) {
			rem=temp%10;
			sum=(sum*10)+rem;
		}
		if(n==sum) {
			System.out.println(n+" is a palindrome number");
		}
		else {
			System.out.println(n+" is not a palindrome number");
		}
	}

}
