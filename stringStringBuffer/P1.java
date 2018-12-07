package stringStringBuffer;

public class P1 {

	public static void main(String[] args) {
		
		StringBuffer str=new StringBuffer("abcba");
		StringBuffer rev=str.reverse();
		if(str.equals(rev)) {
			System.out.println("It is pallindrome");
		}
		else {
			System.out.println("it is not pallindrome");
		}

	}

}
