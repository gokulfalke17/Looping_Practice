/*
13. Write a C program to swap first and last digits of a number.
*/

import java.util.*;
public class SwapFirstAndLast_13 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num,i,temp,p,p1,first,last;
		System.out.println("Enter Number ");
		num = scn.nextInt();

		System.out.println("Before Swapping Digits "+num);

		temp = num;
		int count=0;
		while(num!=0){
			num = num/10;
			count++;
		}
		num = temp;

		p = (int)Math.pow(10,--count);
		first = num%10;
		
		first = first*p;
		last = num/p;
		System.out.println("last : "+last);
		//System.out.println("p1: "+p1);
		last = num/p;
		System.out.println("first : "+first);
		num = num%p;
		num = num/10;
		num = num*10;
		System.out.println("num : "+num);
		int afterSwap = first+num+last;
		

		System.out.println("After Swapping Digits "+afterSwap);
		
		
	}
}