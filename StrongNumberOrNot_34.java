/*
34. Write a java program to check whether a number is Strong number or not. 
*/

import java.util.*;
public class StrongNumberOrNot_34 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num;
		System.out.println("Enter Number ");
		num = scn.nextInt();

		int temp = num;
		int sum = 0;
		while(num!=0) {
			int rem = num%10;
			int i = 1;
			int mul = 1;
			while(i<=rem) {
				mul = mul*i;
				i++;
			}
			sum = sum+mul;
			num = num/10;
		}
		if(sum==temp) {
			System.out.println("It is Strong Number");
		}else {
			System.out.println("It is Not Strong Number");
		}
	}
}