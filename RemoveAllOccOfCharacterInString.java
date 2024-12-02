/*
23.Write a JAVA program to remove all occurrences of a character from string.
*/

class RemoveAllOccOfCharacterInString {
	public static void main(String[] args) {
		
		String str = "good morning india aoood";
		char search = 'o';
		
		char ch[] = str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(ch[i]==search) {
				count++;
				for(int j=i;j<ch.length-count;j++) {
					ch[j] = ch[j+1];
				}
			i--;
			}
		}

		StringBuffer sb = new StringBuffer();
		for(int i=0;i<ch.length-count;i++) {
			sb.append(ch[i]);
		}

		System.out.println(sb);
	}
}	
