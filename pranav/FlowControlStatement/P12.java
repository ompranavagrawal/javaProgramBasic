/*Write a program to check if a given number is prime or not*/
import java.util.Scanner;
public class P12 {    
public static void main(String[] args) { 
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int flag=0;
	if(num==1){
		System.out.print("Neither Prime nor Composite");
	}
	else{
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				flag++;
				break;
			}
		}
	}
	if(flag!=0){
		System.out.print("Not Prime");
	}
	else
		System.out.print("Prime");
		
	
}
}