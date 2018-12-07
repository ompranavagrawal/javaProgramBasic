import java.util.Scanner;
public class P6{
   public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++){
			for(int j=i;j<10;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted array");
		for(int i=0;i<10;i++){
			System.out.println(arr[i]);
		}
   }
}