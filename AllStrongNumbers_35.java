/*
35. Write a java program to print all Strong numbers between 1 to n. 
*/

import java.util.*;
public class AllStrongNumbers_35 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num;
		int temp,sum,i,rem,mul,count;
		System.out.println("Enter Limit ");
		num = scn.nextInt();
		
		System.out.println("Strong Numbers ");
		for(i=1;i<=num;i++) {
			temp = i;
			sum = 0;
			while(temp!=0) {
				mul = 1;
				rem = temp%10;
				count=1;
				while(count<=rem) {
					mul = mul*count;
					count++;
				}
				sum = sum+mul;
				temp = temp/10;
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
	}
}