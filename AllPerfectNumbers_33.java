/*
33. Write a java program to print all Perfect numbers between 1 to n. 
*/

import java.util.*;
public class AllPerfectNumbers_33 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num,i,j,sum;

		System.out.println("Enter Limit ");
		num = scn.nextInt();

		System.out.println("All Perfect Numbers ");
		for(i=1;i<=num;i++) {
			sum=0;
			for(j=1;j<i;j++) {
				if(i%j==0) {
					sum = sum+j;
				}
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
	}
}