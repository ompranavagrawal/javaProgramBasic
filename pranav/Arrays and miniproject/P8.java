import java.util.Scanner;
public class P8{
   public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
		}
		int size=10;
		int counter = 0;
		int max = 0;
		int index_max = 0; //to store the index of maximum duplicated element
     
		int i,j;
		for(i=0;i<size;i++)
		{
			counter = 0;
			for(j=0;j<size;j++)
			{
            //check for duplicates in the array
				if(arr[i] == arr[j])
					counter++;
			}
			//update the counter and max_index
			if(counter > max)
			{
				max = counter;
				index_max = i;
			}
		}
     
		System.out.println("->"+ arr[index_max]);
	}
}
 