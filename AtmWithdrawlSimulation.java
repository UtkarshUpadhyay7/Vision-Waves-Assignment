package medium;
import java.util.Scanner;
public class AtmWithdrawlSimulation {

	public static void main(String[] args) {
	
		//1] Creating an Scanner Object
		Scanner sc = new Scanner(System.in);
		
		//2] Taking Input
		System.out.println("Enter the Amount");
		int amount = sc.nextInt();
		
		System.out.println("Enter the withdrawl amount");
		int balance = sc.nextInt();
		
		
		//3] Main Logic and Output
		
		if(balance %100 != 0) {
			System.out.println("Invalid Amount");
		}
		else if(amount >= balance) {
			System.out.println("Withdrawl Successfull");
		}
		else {
			System.out.println("Insufficient balance");
		}
		
		sc.close();
	}

}
