package stringStringBuffer;
/*Given two strings, a and b, create a bigger string made of the first char of a, 
 * the first char of b, the second char of a, the second char of b, and so on. 
 * Any leftover chars go at the end of the result. If input is “abc” and “xyz”, 
 * then output should be “axbycz”.*/
public class P10 {

	public static void main(String[] args) {
		String a="abc12";
		String b="xyz";
		StringBuffer sb=new StringBuffer();
		int j=0,k=0;
		for(int i=0;i<a.length()+b.length();i++) {
			if(i%2==0 && k<a.length()) {
				System.out.print(a.charAt(k));
				k++;
			}
			else if(i%2!=0 && j<b.length()) {
				System.out.print(b.charAt(j));
				j++;
			}
			else {
				if(k<a.length()) {
					System.out.print(a.substring(k, a.length()));
					break;
				}
				else if(j<b.length()) {
					System.out.print(b.substring(j, b.length()));
					break;
				}
			}
		}
		

	}

}
