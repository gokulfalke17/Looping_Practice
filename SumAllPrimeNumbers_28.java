/*
28. Write a java program to find sum of all prime numbers between 1 to n. 
*/

import java.util.*;
public class SumAllPrimeNumbers_28 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num,i,j,count,sum=0;

		System.out.println("Enter Limit ");
		num = scn.nextInt();
		
		System.out.println("Prime Numbers ");
		for(i=1;i<=num;i++) {
			count=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				sum = sum+i;
				System.out.println(i);
			}
		}
		System.out.println("Sum of All Prime Numbers ");
		System.out.println(sum);
	}
}