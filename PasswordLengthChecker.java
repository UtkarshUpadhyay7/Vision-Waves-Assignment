package basic;
import java.util.Scanner;

public class PasswordLengthChecker {

	public static void main(String[] args) {
		
		//1] Creating an Scanner object
		Scanner  sc= new Scanner(System.in);
		
		
		//2]Taking an input 
		System.out.println("Enter the length of an password :");
		int length = sc.nextInt();
		
		
		//3] Taking an input
		
		if(length>=8) {
			System.out.println(" STRONG PASSWORD");
		}
		else {
			System.out.println("WEAK PASSWORD");
		}
		
		sc.close();

	}

}
