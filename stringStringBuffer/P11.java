package stringStringBuffer;
/*Given a string and an int n, return a string made of n repetitions of the last n characters of the string. 
 * You may assume that n is between 0 and the length of the string, inclusive. For example if the inputs are 
 * “Wipro” and 3, then the output should be “propropro”*/
public class P11 {

	public static void main(String[] args) {
		String str="Wipro";
		int n=3;
		String sub=str.substring(n-1, str.length());
		for(int i=0;i<n;i++) {
			System.out.print(sub);
		}
		
	}

}
