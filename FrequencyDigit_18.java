/*
18. Write a java program to find frequency of each digit in a given integer. 
*/

import java.util.*;
public class FrequencyDigit_18 {
	
	public static void main(String[] args) {
			

		Scanner scn = new Scanner(System.in);
		int num;
		System.out.println("Enter Number ");
		num = scn.nextInt();

		int one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0,zero=0;

		while(num>0){
			int rem = num%10;
			switch(rem) {
				case 1: one++;
				break;
				case 2: two++;
				break;
				case 3: three++;
				break;
				case 4: four++;
				break;
				case 5: five++;
				break;
				case 6: six++;
				break;
				case 7: seven++;
				break;
				case 8: eight++;
				break;
				case 9: nine++;
				break;
				case 0: zero++;
				break;
				default : 
					System.out.println("Invalid Number...");
			}
			num = num/10;
		}

		if(one!=0)
			System.out.print("One :"+one +"\n");
		if(two!=0)
			System.out.print("Two :"+two +"\n");
		if(three!=0)
			System.out.print("Three :"+three +"\n");
		if(four!=0)
			System.out.print("Four :"+four +"\n");
		if(five!=0)
			System.out.print("Five :"+five +"\n");
		if(six!=0)
			System.out.print("Six :"+six +"\n");
		if(seven!=0)
			System.out.print("Seven :"+seven +"\n");
		if(eight!=0)
			System.out.print("Eight :"+eight +"\n");
		if(nine!=0)
			System.out.print("Nine :"+nine +"\n");
		if(zero!=0)
			System.out.print("Zero :"+zero +"\n");
	}
}