package medium;
import java.util.Scanner;

public class EmployeePerformanceRating {

	public static void main(String[] args) {
		
		// 1] creating an Scanner Object
		Scanner sc = new Scanner(System.in);
		
		//2 ] Taking input
		System.out.println("Enter the Employee Rating --");
		int rating = sc.nextInt();
		
		// 3] Main logic and output
		
		if(rating >= 75) {
			System.out.println("Excellent Rating");
			}
		 if(rating >=50 )  {
			 if(rating <=74) {
				 System.out.println("Good Rating");
			 }		
		}
		 else {
			 System.out.println("Need Improvement ");
		 }
   sc.close();
	}

}
