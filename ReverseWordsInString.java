/*
13.Write a JAVA program to reverse order of words in a given string.
*/

class ReverseWordsInString {

	public static String reverseWord(String str) {
		char ch[] = str.toCharArray();
		int start = 0;
		int end = 0;
		for(int i=0;i<str.length();i++) {
			if(ch[i]==' ') {
				end = i-1;
				while(start<end) {
					char temp = ch[start];
					ch[start] = ch[end];
					ch[end] = temp;
					start++;
					end--;
				}
				start = i+1;
			}
		}
	
		end = str.length()-1;
		while(start<end) {
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				start++;
				end--;
		}

		String s = new String(ch);
		return s;
	}

	public static void main(String[] args) {

		String str = "Good Morning";
		String rev = reverseWord(str);
		System.out.println(rev);

	}
}