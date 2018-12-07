package stringStringBuffer;
/*
 * Given a string of even length, return the first half.
 *  So the string "CatDog" yields "Cat". If the string length is odd number then return null.
 * */

public class P4 {

	public static void main(String[] args) {
		String str="CatDog";
		String str2=null;
		//System.out.println(str.length());
		if(str.length()%2==0) {
			int len=str.length()/2;
			System.out.println(str.substring(0, len));
		}
		else {
			System.out.println(str2);
		}

	}

}
