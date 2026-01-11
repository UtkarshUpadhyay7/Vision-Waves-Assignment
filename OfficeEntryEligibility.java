package basic;
import  java.util.Scanner;

public class OfficeEntryEligibility {

	public static void main(String[] args) {
		
		//1] Creating an Scanner object
		Scanner sc = new Scanner(System.in);
		
		// 2] Taking an input 
		
		System.out.println("Enter  the  time in hours");
		int time = sc.nextInt();
		
		
		//3] Main logic and output 
		
		if(time <= 9) {
			System.out.println("Allowed");
		}
		else {
			System.out.println("Late Entry ");
		}
		
		sc.close();
		

	}

}
