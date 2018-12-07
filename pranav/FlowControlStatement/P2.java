public class P2{
   public static void main(String []args) {
	int a=Integer.parseInt(args[0]);	
	if(a==0){
		System.out.println("Zero is not even or odd");
	}
	else if(a%2==0){
		System.out.println("Even");	
	}      
	else if(a%2!=0){
			System.out.println("Odd");	
	}
   }
}