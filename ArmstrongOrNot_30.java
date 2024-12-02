/*
30. Write a java program to check whether a number is Armstrong number or not. 
*/

import java.util.Scanner;
public class ArmstrongOrNot_30 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num,i;
		System.out.println("Enter Number ");
		num = scn.nextInt(); //153


		int temp = num;
		int count=0;
		while(num!=0) {
			num = num/10;
			count++;
		}
		num = temp;
		int sum = 0;
		while(num!=0) {
			int rem = num%10;
			//p = (int)Math.pow(rem,count);
			int p=1;
			int pow=1;
			while(p<=count) {
				pow = pow*rem;
				p++;
			}
			sum = sum+pow;
			num = num/10;
		}
		if(sum==temp) {
			System.out.println("It is Armstrong Number");
		}else{
			System.out.println("It is Not Armstrong Number");
		}
	}
}

//1*1*1  1
//5*5*5  125
//3*3*3  27