/*
21.Write a JAVA program to remove first occurrence of a character from string.
*/

class RemovefirstOccurrenceCharacterInString {
	public static void main(String[] args) {
		
		String str = "good morning";
		char search = 'n';

		char ch[] = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {

			if(ch[i]==search) {

				for(int j=i;j<ch.length-1;j++) {
					ch[j] = ch[j+1];
				}

				break;
			}
		}
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<ch.length-1;i++) {
			sb.append(ch[i]);
		}
		System.out.println(sb);
	}
}