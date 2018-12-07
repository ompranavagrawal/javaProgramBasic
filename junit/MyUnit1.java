package junit;

public class MyUnit1 {
	public boolean palindromeCheck(String str) {
		StringBuilder sb=new StringBuilder(str);
		StringBuilder sb1=sb.reverse();
		if(sb.equals(sb1)) {
			return true;
		}
		else {
			return false;
		}
	}
}
