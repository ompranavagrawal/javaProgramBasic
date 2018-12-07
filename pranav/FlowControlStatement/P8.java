/*Write a program to print the color name, based on color code. If color code in not valid then print 
"Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.*/

import java.util.Scanner;
public class P8{
   public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String ch=sc.next();
		switch(ch){   
		case "R": System.out.print("Red");  
		break;  
		case "B": System.out.print("Blue");  
		break;  
		case "G": System.out.print("Green");  
		break;  
		case "O": System.out.print("Orange");  
		break;  
		case "Y": System.out.print("Yellow");  
		break;  
		case "W": System.out.print("White");  
		break; 
		default:System.out.print("Invalid Code");  
    }
	
   }
}
 