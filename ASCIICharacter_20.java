/*
20. Write a java program to print all ASCII character with their values. 
*/

public class ASCIICharacter_20 {
	
	public static void main(String[] args) {
		
		int i;

		for(i=0;i<255;i++) {
			System.out.printf("ASCII Charater %c : %d \n",i, i);
		}
	}
}