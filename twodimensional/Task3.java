package twodimensional;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		// 1] Creating an Scanner Class
		Scanner sc = new Scanner(System.in);
		
		// 2] Taking the size of an row and columns 
		System.out.println("Enter the size of an row  ");
		int row = sc.nextInt();
		
		System.out.println("Enter the size of an coumns ");
		int col = sc.nextInt();
		
		// 3] Condition to check number of rows equals to columns 
		if(row != col) {
			System.out.println("Matrix is not an Identity matrix");
			return;
		}
		
		// 4] Initialize the  array
		int [][] arr = new int [row] [col];
		
		// 5] loop -- To store the elements of an array
		System.out.println("Enter the elements of an array");
		for( int i = 0 ; i < row ; i++) {
			for( int j = 0 ; j < col ; j++) {
				arr [i][j]=sc.nextInt();		
				}
		}
		
		// 6] Initial assumptions 
		boolean is_Identify = true;
		
		// 7] loop -- to check Identity Matrix
		for( int i = 0 ;i < row ; i++) {
			for( int j = 0 ;j < col ; j++) {
				// It checks for diagonals elements 
				if(i == j && arr[i] [j] != 1) {
					is_Identify = false;
					break;
				}
				// It checks for non diagonal elements
				if( i!=j && arr[i] [j] != 0) {
					is_Identify=false;
				}
			}
		}
		
		// 8 ] To display output 
		if(is_Identify) {
			System.out.println("Matrix is Identity");
			}
		else {
			System.out.println("Matrix  is not Identity");
		}
		sc.close();
	}

}
