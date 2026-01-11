package medium;
import  java.util.Scanner;


public class EvenNumbers {

	public static void main(String[] args) {
		
		// 1] Creating an Scanner object
		Scanner sc = new Scanner(System.in);
		
		// 2] Taking an Input
		System.out.println("Enter the number!");
		int  num = sc.nextInt();
		
		// 3] Main logic 
		
		//First N even prime numbers
	 for(int i=0;i<=num ; i=i+2) {
		 System.out.print(i+ " ");
	 }


		sc.close();
	}

}
