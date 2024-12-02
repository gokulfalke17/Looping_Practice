/*
10. Write a java program to count number of digits in a number. 
*/

import java.util.*;
public class CountDigit_10 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num,count=0;
		System.out.println("Enter Number ");
		num = scn.nextInt();

		while(num!=0){
			num = num/10;
			count++;
		}
		System.out.println("Number of Digits :"+count);
	}
}