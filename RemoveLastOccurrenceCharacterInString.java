/*
22.Write a JAVA program to remove last occurrence of a character from string.
*/

class RemoveLastOccurrenceCharacterInString {
	public static void main(String[] args) {
		
		String str = "good morning";
		char search = 'g';
		int index = -1;
		char ch[] = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(ch[i]==search) {
				index = i;
			}
		}

		for(int i=index;i<ch.length-1;i++) {
			ch[i] = ch[i+1];
			
		}

		StringBuffer sb = new StringBuffer();
		for(int i=0;i<ch.length-1;i++) {
			sb.append(ch[i]);
		}

		System.out.println(sb);
	}
}