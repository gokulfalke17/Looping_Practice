/*
12. Write a java program to find sum of first and last digit of a number. 
*/

import java.util.*;
public class SumFirstAndLastDigit_12 {
	
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);

		int num,last=0,first=0;

		System.out.println("Enter Number ");
		num = scn.nextInt();

		last = num%10;

		while(num!=0){
			first = num%10;
			num = num/10;
		}

		System.out.println("Last Digit "+last);
		System.out.println("First Digit "+first);
		int sum = first+last;
		System.out.println("Sum of First and Last Digit "+sum);
	}
}