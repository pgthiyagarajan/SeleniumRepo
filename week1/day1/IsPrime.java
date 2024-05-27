package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n = 4;
		if (n <= 1) {
			System.out.println(n+" is not a prime number");
		}
        for (int i = 2; i <= n; i++) {
            if (n==2 || n==3) {
            	System.out.println(n+" is a prime number");
            	break;
            }
            else if(n % i == 0)
            {
            	System.out.println(n+" is not a prime number");
            	break;
            }
            System.out.println(n+" is a prime number");
        }
	}
}
