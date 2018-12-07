import java.util.Scanner;
public class P2{
   public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
		}
		int small=arr[0];
		for(int i=1;i<10;i++){
			if(arr[i]<small){
				small=arr[i];
			}
		}
		System.out.println("smallest number is "+small);
		int big=arr[0];
		for(int i=1;i<10;i++){
			if(arr[i]>big){
				big=arr[i];
			}
		}
		System.out.println("biggest number is "+big);
   }
}