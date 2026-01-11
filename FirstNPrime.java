package basic;
import java.util.Scanner;

public class FirstNPrime {
	public static void main(String args[]) {
		
		//1] Creating an Scanner Object
		Scanner sc = new Scanner(System.in);
		
		//2] Taking an input
		System.out.println("Enter the number !");
		int num = sc.nextInt();
		
	
		
		//3] Main logic
		
		for(int i=1;i<=num;i++) {
			System.out.print(i + " ");
		}
		
		sc.close();
	}

	
}
