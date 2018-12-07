package stringStringBuffer;
/*Return a version of the given string, where for every star (*) in the string the star and 
 * the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 * */
public class P8 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("ab*******xxcccc****ddd*d"); //accdd

		int i=0;
		StringBuffer str1=new StringBuffer(str);
		while(i<str.length()) {
			if(str.charAt(i)=='*') {
				int j=1;

				while(str.charAt(i+j)=='*') {
					j++;
				}
			
				
				StringBuffer str2=str;
				str=new StringBuffer(str.substring(0, i-1));
				str2=new StringBuffer(str.append(str2.substring(i+j+1, str2.length())));
				
			}
			i++;
		}
		System.out.println(str);
		
		
	}

}
