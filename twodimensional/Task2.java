// 2 ] Largest Element in Each Row
//Problem Statement:
// Find the largest element from each row of a matrix.

package twodimensional;
import java.util.Scanner;

public class Task2 {
         public static void main(String[] args) {
			
        	 // 1] Creating an Scanner Class
        	 Scanner sc = new Scanner(System.in);
        	 
        	 // 2] Taking the  size of an row and columns
        	 System.out.println("Enter the size of an  row");
        	 int row = sc.nextInt();
        	 
        	 System.out.println("Enter the size of an columns");
        	 int col = sc.nextInt();
        	 
        	 // 3] Initialize the 2D Array
        	 int arr [] [] = new int [row] [col];
        	 
        	 //4] Taking the elements of an array
        	 
        	 System.out.println("Enter the elements of an array");
        	 for(int i = 0 ;i<row ; i++) {     // in rows
        		 for (int j = 0 ; j<col ; j++) {   // in columns 
        			 arr [i][j]= sc.nextInt();
        		 }
        	 }
        	 
        	 // 5] Main logic
        	 for(int i = 0 ;i <row ; i++) {
        		 int max_row = arr[i][0];
        		 for(int j =0 ; j<col ; j++) {
        			 if(arr[i][j]>max_row) {
        				 
        				 max_row = arr[i][j];
        			 }
        		 }
        		 System.out.println(max_row);
        	 }
        	 sc.close();
		}
}
