package week1.day1;

import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,i,j;
		a=0;
		b=1;
		j=8;
		System.out.println(a+"\n"+b);
		for(i=2;i<j;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
