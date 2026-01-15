package assignment;
import java.util.Scanner;

public class PalindromeArrayUser {

	public static void main(String[] args) {
		
		// 1] Creating an Scanner Class
		Scanner sc = new Scanner(System.in);
		
		// 2] Entering the Size of an array
		System.out.println("Enter the size of An Array");
		int size = sc.nextInt();
		
		// 3] Initialize the array
		int arr [] = new int [size];
		
		// 4] Initial condition
	  boolean	is_palindrome = true;
   
	  
	  // 5] Taking the array Elements 
	  System.out.println("Enter the Array Elements ");
	  for(int i =0 ; i<arr.length ; i++) {
		  arr[i]= sc.nextInt();  
			}
	  
	  // 6] Initial condition
//	  int left = 0;
//	  int right = arr.length-1;
	  
	  
	  // 6] Main logic 
	  for(int i = 0; i<arr.length ; i++) {
		  if(arr[i] != arr[arr.length-1-i]) {
			  is_palindrome = false;
			 
		  }
	  }
	  
	  // 7 ] To display output
	  if(is_palindrome == true) {
		  System.out.println("Array is palindrome");
	  }
	  else {
		  System.out.println("Array is not  palindrome  ");
	  }
	  
	  sc.close();
	}

}
