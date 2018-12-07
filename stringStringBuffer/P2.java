package stringStringBuffer;

public class P2 {

	public static void main(String[] args) {
		String str1="Mark";
		String str2="Kate";
		String str3;
		String str22=str2.toLowerCase();
		char lastOfS1=str1.charAt(str1.length()-1);
		char lastOfS2=str22.charAt(0);
		if(lastOfS1==lastOfS2) {
			String print=str1.concat(str22.substring(1));
			System.out.println(print);
		}
		else {
			String print=str1.concat(str22);
			System.out.println(print);
		}

	}

}
