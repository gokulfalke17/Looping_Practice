/*
27. Write a java program to print all Prime numbers between 1 to n. 
*/

import java.util.*;
public class AllPrimeNumbers_27 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num,i,j,count;

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
				System.out.println(i);
			}
		}

	}
}