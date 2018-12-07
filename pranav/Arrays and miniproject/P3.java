import java.util.Scanner;
public class P3{
   public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to search");
		int num=sc.nextInt();
		int index=0;
		for(int i=0;i<10;i++){
			if(num==arr[i]){
				index=i+1;
			}
			
		}
		if(index>0){
			System.out.println(index);
		
		}
		else
			System.out.println("-1");
   }
}