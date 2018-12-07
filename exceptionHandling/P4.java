package exceptionHandling;
/*Write a class MathOperation which accepts integers from command line. 
 * Create an array using these parameters. Loop through the array and obtain the 
 * sum and average of all the elements. 
Display the result.
 
Check for various exceptions that may arise like ArithmeticException, NumberFormatException, and so on.
For example: The class would be invoked as follows: 
C:>java MathOperation 1900, 4560, 0, 32500*/
public class P4 {

	public static void main(String[] args) {
		try {
			int arr[] =new int[args.length];
			for(int i=0;i<args.length;i++) {
				arr[i]=Integer.parseInt(args[i]);
			}
			int sum=0;
		
			for(int i=0;i<args.length;i++) {
				sum=sum+arr[i];
			}
			System.out.println("Sum->"+sum);
			System.out.println("Average->"+sum/args.length);
		}
		catch (Exception e) {
			System.out.println(e.getClass());
		}
	}
}
