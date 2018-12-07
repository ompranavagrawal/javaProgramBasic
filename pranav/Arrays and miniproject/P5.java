import java.util.Arrays; 
import java.util.Scanner;
public class P5{
   public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<10;i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("smallest number is "+arr[0]);
		int ssmall=arr[0];
		for(int i=0;i<10;i++){
			if(ssmall<arr[i]){
				ssmall=arr[i];
				break;
			}
		}
		
		System.out.println("Second smallest number is "+ssmall);
		System.out.println("biggest number is "+arr[9]);
		
		int slarge=arr[9];
		for(int i=9;i>-1;i--){
			if(slarge>arr[i]){
				slarge=arr[i];
				break;
			}
		}
		
		System.out.println("Second biggest number is "+slarge);
		
   }
}