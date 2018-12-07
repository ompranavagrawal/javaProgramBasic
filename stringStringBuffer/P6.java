package stringStringBuffer;
/*
 * Given 2 strings, a and b, return a string of the form short+long+short, 
 * with the shorter string on the outside and the longer string on the inside. 
 * The strings will not be the same length, but they may be empty (length 0). 
 * If input is "hi" and "hello", then output will be "hihellohi"
 * 
 * */
public class P6 {

	public static void main(String[] args) {
		String str1="hi";
		String str2="hello";
		int l1=str1.length();
		int l2=str2.length();
		String shorter;
		String longer;
		if(l1>l2) {
			longer=str1;
			shorter=str2;
		}
		else {
			longer=str2;
			shorter=str1;
		}
		System.out.println(shorter+longer+shorter);

	}

}
