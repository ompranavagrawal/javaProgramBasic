package stringStringBuffer;
/*
 * Given two strings, a and b, create a bigger string made of the first char of a, 
 * the first char of b, the second char of a, the second char of b, and so on. 
 * Any leftover chars go at the end of the result.
 * If the inputs are "Hello" and "World", then the output is "HWeolrllod".
 * */
public class P9 {

	public static void main(String[] args) {
		String a="Hello";
		String b="World";
		StringBuffer sb=new StringBuffer();
		int j=0,k=0;
		for(int i=0;i<a.length()+b.length();i++) {
			if(i%2==0) {
				System.out.print(a.charAt(k));
				k++;
			}
			else {
				System.out.print(b.charAt(j));
				j++;
			}
		}
		System.out.println(sb);

	}

}
