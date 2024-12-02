/*
26. Write a java program to check whether a number is Prime number or not. 
*/

import java.util.*;
public class PrimeOrNot_26 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num,i,flag=0;

		System.out.println("Enter Number ");
		num = scn.nextInt();

		for(i=2;i<num;i++){
			if(num%i==0){
				flag++;
				break;
			}
		}

		if(flag==0) {
			System.out.println("It is Prime");
		}else{
			System.out.println("It is Not Prime");
		}
	}
}