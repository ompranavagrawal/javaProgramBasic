/*Initialize two character variables in a program and display the characters in alphabetical order.
Eg1) if first character is s and second is e
O/P: e,s
Eg2) if first character is a and second is e
O/P:a,e*/

public class P4{
   public static void main(String []args) {
	char a='f';   //2
	char b='e';   //1
	if(a>b){
		System.out.println(b+","+a);	
	}
	else{
		System.out.println(a+","+b);	
	}
   }
}