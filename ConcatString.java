/*
3. Write a JAVA program to concatenate two strings.
*/
class ConcatString {
	public static void main(String[] args) {
		
		//without using inbuilt method
			String s1 = "gokul ";
			String s2 = "falke";

			String concat  = s1+s2;
			System.out.println("Concat String is (without Inbuilt Method) :: "+concat);
		
		//using inbuilt method
		String str1 = "girish";
		String str2 = " tech hub";

		str1 = str1.concat(str2);
		System.out.println("Concat String is (with Inbuilt Method) :: "+str1);

	}
}