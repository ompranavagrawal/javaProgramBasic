import java.util.Scanner;
public class P1{
   public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<10;i++){
			sum=sum+arr[i];
			
		}
		System.out.println("sum is "+sum);
		System.out.println("Average is "+(double)sum/arr.length);
   }
}