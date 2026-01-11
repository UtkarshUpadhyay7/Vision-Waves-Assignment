package tough;
import java.util.Scanner;

public class CompanyLoginValidation {

	public static void main(String[] args) {
		
		// 1] Creating an Scanner Class
		Scanner sc= new Scanner(System.in);
		
		
		// 2] Taking input
		int cpass =1234;
		boolean login = false;
		
		//3] Taking logic 
		
		for(int i =1;i<=3;i++) {
			System.out.println("Enter the password");
			int pass = sc.nextInt();
			
			if(cpass == pass) {
				System.out.println("Login Successful");
				login = true;
				break;
				
			}
			else {
				System.out.println("Try again");
			}
		
			
		
		}
		if(!login) {
			System.out.println("Account locked");
			
		}
		sc.close();
		

	}

}
