/*
31. Write a java program to print all Armstrong numbers between 1 to n. 
*/

import java.util.Scanner;
public class AllArmstrongNumbers_31 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num,i,temp,count,sum,p,pow,rem;
		System.out.println("Enter Limit ");
		num = scn.nextInt();

		System.out.println("Armstrong Numbers ");
		for(i=1;i<=num;i++) {
			temp = i;
			count = 0;
			sum = 0;
			while(i>0) {
				count++;
				i = i/10;
			}
			i = temp;

			while(i>0) {
				p = 1;
				pow = 1;
				rem = i%10;
				while(count>=p) {
					pow = pow*rem;
					p++;
				}
				sum = sum+pow;
				i = i/10;
			}
			i = temp;
			if(sum==i){
				System.out.println(i);
			}

		}

	}
}