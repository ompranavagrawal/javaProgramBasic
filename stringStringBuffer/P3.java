package stringStringBuffer;

public class P3 {

	public static void main(String[] args) {
		String str="Wipro";
		int n=str.length();
		String str2=str.substring(0, 2);
		//System.out.println(str2);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n;i++) {
			sb=sb.append(str2);
		}
		System.out.println(sb);
		

	}

}
