/*
36.  Write a java program to print Fibonacci series up to n terms 
*/

import java.util.*;
public class FibonacciSeries_36 {
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num,f1=0,f2=1,fib;

		System.out.println("Enter Limit ");
		num = scn.nextInt();
		
		System.out.println("Fibonacci Series ");
		for(int i=1;i<=num;i++){
			fib = f1+f2;
			f1 = f2;
			f2 = fib;
			System.out.println(fib);
		}
	}
}