/*import java.util.Scanner;


public class P20 {


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
		String ch;
		do{
        System.out.println("\nMenu");
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");

        System.out.print("\nWhat would you like to do?: ");
        int choice = kb.nextInt();
        System.out.println();


        if (choice == 1){
            System.out.print(addition());
        }
        else if (choice == 2){
            System.out.print(subtraction());
        }

        System.out.println("Do you want to continue?");
        
		ch=kb.nextLine();
		
		}while(ch.equals("Y")||ch.equals("y"));
    }

    public static int addition(){

        int nOne, nTwo;
        Scanner kb = new Scanner(System.in);

        System.out.println("Addition");

        System.out.print("\nFirst Number: ");
        nOne = kb.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = kb.nextInt();

       
        //System.out.println("\nSum: " + nOne + " + " + nTwo + " = " + (nOne + nTwo));
		return (nOne + nTwo);
    }

    public static int subtraction(){
        int nOne, nTwo;
        Scanner kb = new Scanner(System.in);

        System.out.println("Subtraction");

        System.out.print("\nFirst Number: ");
        nOne = kb.nextInt();

        System.out.print("\nSecond Number: ");
        nTwo = kb.nextInt();

       
        //System.out.println("\nSum: " + nOne + " - " + nTwo + " = " + (nOne - nTwo));
		return (nOne - nTwo);
    }
}*/
import java.util.Scanner;
public class P20 {

public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner input = new Scanner(System.in);
    boolean mainLoop = true;

    int choice;
    while(true){
        System.out.println("\nCalculator Main Menu\n");
        System.out.print("1.) Addition \n");
        System.out.print("2.) Subtraction.\n");
        
        System.out.print("3.) Exit\n");
        System.out.print("\nEnter Your Menu Choice: ");

        choice = input.nextInt();




    switch(choice){

    case 1:
        //Definitions
        int adNumf, adNuml, sum;
        System.out.print("Please Enter The First Number: ");
        adNumf = input.nextInt();
        System.out.print("\nPlease Enter The Second Number: ");
        adNuml = input.nextInt();
        sum = adNumf + adNuml;
        System.out.print("The Sum Of Those Numbers is: " +sum);
        break;

    case 2: 
        int subNum1, subNum2, sum2;
        System.out.println("\nPlease Enter The First Number: ");
        subNum1 = input.nextInt();
        System.out.println("Please Enter The Second Number: ");
        subNum2 = input.nextInt();
        sum2 = subNum1 - subNum2;
        System.out.println("The Subtraction Leaves The Number: " +sum2);
        break;
    case 3: 
        System.exit(0);
         break;
    default :
             System.out.println("This is not a valid Menu Option! Please Select Another");
             break;

    }


    }




    }

   }