package exceptionHandling;

import java.util.Scanner;

/*
 * Write a program that takes as input the size of the array and the elements in the array. 
 * The program then asks the user to enter a particular index and prints the element at that index.
 This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms 
 to handle this exception. In the catch block, print the class name of the exception thrown.
Sample Input and Output 1:
Enter the number of elements in the array
3
Enter the elements in the array
20
90
4
Enter the index of the array element you want to access
2
The array element at index 2 = 4
The array element successfully accessed

 Sample Input and Output 2:
Enter the number of elements in the array
3
Enter the elements in the array
20
90
4
Enter the index of the array element you want to access
6
java.lang.ArrayIndexOutOfBoundsException
 * */
public class P2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access");
		int ind=sc.nextInt();
		try {
			System.out.println(arr[ind]);
		}
		catch(Exception e) {
			System.out.println(e.getClass());
		}

	}

}
