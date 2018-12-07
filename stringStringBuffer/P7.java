package stringStringBuffer;
/*
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, 
 * and otherwise return the string unchanged. If the input is "xHix", then output is "Hi".*/
public class P7 {

	public static void main(String[] args) {
		String str1="xHix";
		//String str=null;
		if(str1.charAt(0)=='x') {
			 str1=(str1.substring(1, str1.length()));
		}
		if(str1.charAt(str1.length()-1)=='x') {
			 str1=(str1.substring(0,str1.length()-1));
		}
		System.out.println(str1);

	}

}
