/*
8. Write a java program to find sum of all odd numbers between 1 to n. 
*/

import java.util.*;
public class SumAllOddNumbers_08 {
	
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);

		int num,i,sum=0;
		System.out.println("Enter Number ");
		num = scn.nextInt();

		System.out.println("Odd Numbers ");
		for(i=1;i<=num;i++) {
			if(i%2!=0){
				System.out.println(i);
			}
		}

		System.out.println("Sum of All Odd Number ");
		for(i=1;i<=num;i++) {
			if(i%2!=0){
				sum = sum+i;
			}
		}

		System.out.println(sum);
	}
}