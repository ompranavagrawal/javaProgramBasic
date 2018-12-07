public class P18 {    
public static void main(String[] args) { 
		int num=12321;
		int numt=num;
		int rev = 0; 
          
        while (num != 0) 
        { 
			rev=(rev*10)+(num % 10); 
            
            num = num/10; 
        }
		//System.out.print(rev);
		if(numt==rev){
			System.out.print(numt+" is a pallindrome");
		}
		else
			System.out.print(numt+" is not a pallindrome");
}
}