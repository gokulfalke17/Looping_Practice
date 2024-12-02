/*
32. Write a java program to check whether a number is Perfect number or not. 
*/

import java.util.*;
public class PerfectOrNot_32 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num,sum=0,i;

		System.out.println("Enter Number ");
		num = scn.nextInt();

		for(i=1;i<num;i++) {
			if(num%i==0) {
				sum = sum+i;
			}
		}
		if(sum==num) {
			System.out.println("It is Perfect Number");
		}else{
			System.out.println("It is Not Perfect Number");
		}
	}
}