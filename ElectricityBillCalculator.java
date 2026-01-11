package tough;
import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		
		// 1]  Creating an Scanner Object
		Scanner sc = new Scanner(System.in);
		
		
		// 2] Taking input
		System.out.println("Enter the units of electricty consumed !");
		int units = sc.nextInt();
		
		// 3] taking rate 
		int rate;
		
		
		//3] Main Logic 
		
	
		if(units<=100) {
			System.out.println("rate " + units*5);
		}
		else if(units >100 && units <=200) {
			System.out.println("rate " + units*7);
		}
		else {
			System.out.println("rate " + units*10);
		}
		
		sc.close();

	}

}
