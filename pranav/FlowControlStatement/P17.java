/*Write a program to reverse a given number and print*/
public class P17 {    
public static void main(String[] args) { 
		int num=1234;
		
		int rev = 0; 
          
        while (num != 0) 
        { 
			rev=(rev*10)+(num % 10); 
            
            num = num/10; 
        }
		System.out.print(rev);
}
}