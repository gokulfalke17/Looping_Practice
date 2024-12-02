/*
11. Write a java program to find first and last digit of a number.
*/

import java.util.*;
public class FirstAndLast_11 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num,first=0,last=0;
		System.out.println("Enter Number :");
		num = scn.nextInt();

		last = num%10;

		while(num!=0){
			first=num%10;
			num = num/10;
		}

		System.out.printf("Last is %d\n",last);
		System.out.printf("First is %d\n",first);

		System.out.println("Sum of First and List Digit :"+(first+last));
	}
}