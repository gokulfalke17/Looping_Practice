/*
6. Write a java program to find sum of all natural numbers between 1 to n. 
*/

import java.util.*;
public class SumAllNaturalNumbers_06 {
	
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);

		int num,sum=0;
		System.out.println("Enter Number ");
		num = scn.nextInt();

		System.out.println("Natural Numbers ");
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}

		System.out.println("Sum of All Natural Numbers ");
		for(int i=1;i<=num;i++) {
			sum = sum+i;
		}

		System.out.println(sum);
	}
}