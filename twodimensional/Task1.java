// 1] Count Even and Odd Elements
//Problem Statement:
// Count the number of even and odd elements present in a 2D array.
package twodimensional;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

    	
    	// 1] Creating an Scanner Class
        Scanner sc = new Scanner(System.in);

        // 2] Taking size of rows and columns
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();

        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();

        // 3] Initialize 2D array
        int[][] arr = new int[row][col];

        // 4] Initial count 
        int even_count = 0;
        int odd_count = 0;

        // 5] Taking array elements
        System.out.println("Enter the elements of the array:");

        // 6] Storing elements in 2-D Array
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 7] Main logic
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {

                if(arr[i][j] % 2 == 0) {
                    even_count++;
                } else {
                    odd_count++;
                }
            }
        }

        // 8] Output
        System.out.println("Even numbers count: " + even_count);
        System.out.println("Odd numbers count: " + odd_count);

        sc.close();
    }
}
