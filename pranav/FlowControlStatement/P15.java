public class P15 {    
public static void main(String[] args) { 
		int n=1234;
		int m=n;
		int sum = 0; 
          
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        }
		System.out.print(m+"->"+sum);
}
}