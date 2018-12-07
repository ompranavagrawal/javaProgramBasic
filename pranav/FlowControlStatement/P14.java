public class P14 {    
public static void main(String[] args) { 
		int i=Integer.parseInt(args[0]);
		if(i==1){
			System.out.println("1 is neither prime nor composite");
		}
		else if(i==0){
			System.out.println("0 is neither prime nor composite");
		}
		else{
			int yn=prime(i);
			if(yn>0){
				System.out.println(i+" is a prime number");
			}
			else{
				System.out.println(i+" is not a prime number");
			}
		}
}
	

public static int prime(int num) {
	int flag=0;
      for(int i=2;i<=num/2;i++){
			if(num%i==0){
				flag++;
				break;
			}
		}
	
	if(flag!=0){
		return 0;
	}
	else
      return 1; 
   }
}