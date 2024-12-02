/*
25.Write a JAVA program to remove all repeated characters from a given string.
*/

class RemoveAllRepeatedCharacterInString {
	public static void main(String[] args) {
		
		String str = "good morning india";
		
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					for(int k=j;k<length;k++) {
						ch[k] = ch[k+1];
					}
				}
			}
		}
		String s = new String(ch);
		System.out.println(s);
	}
}