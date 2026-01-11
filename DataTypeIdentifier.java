package basic;
import java.util.Scanner;

public class DataTypeIdentifier {

	public static void main(String[] args) {
   
		//1] Creating an Scanner object
		Scanner sc = new Scanner(System.in);
		
		//2] Taking an input
		System.out.println("Enter the day");
		int day = sc.nextInt();
		
		//3]  Main logic using switch
		
		switch(day) {
		case 1:
			System.out.println("Working day");
			break;
		case 2:
			System.out.println("Working Day");
			break;
		case 3:
			System.out.println("Working Day");
			break;
		case 4:
			System.out.println("Working Day");
			break;
		case 5:
			System.out.println("Working Day");
			break;
		case 6:
			System.out.println("Weekend");
			break;
		case 7:
			System.out.println("Weekend");
			break;
			default:
				System.out.println("Invalid input");
		}
	
	
			

        sc.close();
	}

}
