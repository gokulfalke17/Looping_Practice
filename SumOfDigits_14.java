/*
14. Write a java program to calculate sum of digits of a number. 
*/

import java.util.*;
public class SumOfDigits_14 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int num,count=0,sum=0;
		System.out.println("Enter Number ");
		num = scn.nextInt();

		while(num!=0){
			num = num/10;
			count++;
			sum = sum+count;
		}
		System.out.println("Number of Digit "+count+"\n"+"Sum of Digit "+sum);
	}
}