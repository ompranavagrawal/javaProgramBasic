/* Write a program to print the sum of the elements of the array with the given below condition. 
If the array has 6 and 7 in succeeding orders, ignore 6 and 7 and the numbers between them for the calculation of sum.
Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]
Eg2) Array Elements - 7,1,2,3,6
O/P: 19
Eg3) Array Elements - 1,6,4,7,9
O/P: 10*/
import java.util.Scanner;
public class P9{
   public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int isix=-1;int iseven=-1;
		for(int i=0;i<10;i++){
			
			if(arr[i]==6){
				isix=i;
			}
			if(arr[i]==7){
				iseven=i;
			}
		}
		if(isix<iseven){
			for(int i=0;i<isix;i++){
				sum=sum+arr[i];
			}
			for(int i=iseven+1;i<10;i++){
				sum=sum+arr[i];
			}
		}
		else{
			for(int i=0;i<10;i++){
				sum=sum+arr[i];
			}
		}
		System.out.println("->"+sum);
   }
}