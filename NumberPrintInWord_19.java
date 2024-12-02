/*
19. Write a java program to enter a number and print it in words. 
*/

import java.util.Scanner;
public class NumberPrintInWord_19 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num,rem;
		int rev=0;
		System.out.println("Enter Number ");
		num = scn.nextInt();

		while(num>0) {
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		while(rev>0) {
			int digit = rev%10;
			switch(digit) {
				case 1:
				System.out.printf("One");
				break;
				
				case 2:
				System.out.printf(" Two");
				break;

				case 3:
				System.out.printf(" Three");
				break;
				
				case 4:
				System.out.printf(" Four");
				break;

				case 5:
				System.out.printf(" Five");
				break;
				
				case 6:
				System.out.printf(" Six");
				break;

				case 7:
				System.out.printf(" Seven");
				break;
				
				case 8:
				System.out.printf(" Eight");
				break;

				case 9:
				System.out.printf(" Nine");
				break;
				
				case 0:
				System.out.printf(" Zero");
				break;
			} 
			rev = rev/10;
		}
		System.out.println();
	}
}