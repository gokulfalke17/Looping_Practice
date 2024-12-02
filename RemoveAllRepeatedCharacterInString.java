/*
25.Write a JAVA program to remove all repeated characters from a given string.
*/

class RemoveAllRepeatedCharacterInString {
	public static void main(String[] args) {
		
		String str = "good morning india";
		char ch[] = str.toCharArray();
		int count = 0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					for(int k=j;k<str.length()-count;k++) {
						ch[k] = ch[k+1];
					}
				}
			}
		}
		String s = new String(ch);
		System.out.println(s);
	}
}