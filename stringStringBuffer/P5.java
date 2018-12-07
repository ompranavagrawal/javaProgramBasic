package stringStringBuffer;
/*
 *  Given a string, return a version without the first and last char, so "Wipro" yields "ipr". 
 *  The string length will be at least 2.
 * 
 * */
public class P5 {

	public static void main(String[] args) {
		String str="Wipro";
		String str2=null;
		if(str.length()>=2) {
			System.out.println(str.substring(1, str.length()-1));
		}
		else {
			System.out.println(str2);
		}

	}

}
