import java.util.Scanner;
public class P10{
   public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[2][2];
		int k=0,i=0,j=0;
		//System.out.println(args.length);
		if((args.length>5)&&(args.length<4)){
			System.out.println("Please enter 4 integer numbers");
		}
		else{
			for(i=0;i<2;i++){
				for(j=0;j<2;j++){
					arr[i][j]=Integer.parseInt(args[k]);
					k++;
				}
				
			}
		}
		int temp=0;
		i=0;j=1;
		temp=arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=temp;
		
		i=0;j=0;
		temp=arr[i+1][j+1];
		arr[i+1][j+1]=arr[j][i];
		arr[j][i]=temp;
		
		
		
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
   }
}