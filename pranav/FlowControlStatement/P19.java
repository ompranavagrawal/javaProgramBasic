/*Write a program to print first 5 values which are divisible by 2, 3, and 5.*/
public class P19 {    
public static void main(String[] args) { 
	int a=2,b=3,c=5,f=0;
	for(int i=1;i<1000;i++){
		if(f==5)
			break;
		if(i%a==0&&i%b==0&&i%c==0){
			System.out.println(i);
			f++;
		}
	}
}
}