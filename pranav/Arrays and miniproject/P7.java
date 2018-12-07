import java.util.Scanner;
public class P7{
   public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
		}
		
		int size=10;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if((arr[i]==arr[j])&&(i!=j)){
					arr[i]=-1;
				}
			}
		}
		
		for(int i=0;i<size;i++){
			if(arr[i]!=-1){
				System.out.print(arr[i]+" ");
			}
		}
   }
}