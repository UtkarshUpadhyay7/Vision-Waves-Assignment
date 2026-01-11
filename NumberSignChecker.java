package basic;
import java.util.Scanner;

public class NumberSignChecker {

	public static void main(String[] args) {
  
		 // 1] creating an Scanner object
		Scanner sc = new Scanner (System.in);
		
		
		//2] Taking an input 
		
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		// 3] Main process and logic 
		
		if(num==0) {
			System.out.println("Number is Zero");
		}
		else if (num >0) {
			System.out.println("Number is Postive");
		}
		else  {
			System.out.println("Number is Negative");
		}
		
		sc.close();


		
	}

}
