////4]Matrix Multiplication
////Problem Statement:
//// Multiply two matrices if possible and print the resulting matrix
package twodimensional;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

    	// 1] Creating the Scanner Class
        Scanner sc = new Scanner(System.in);

        // 2] Taking size of row and columns of 1 matrix
        System.out.println("Enter rows of first matrix:");
        int r1 = sc.nextInt();
        System.out.println("Enter columns of first matrix:");
        int c1 = sc.nextInt();

        // 3] Initialize the first array to store first matrix
        int[][] arr = new int[r1][c1];
        
        // 4] Input first matrix
        System.out.println("Enter elements of first matrix:");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 5] Taking size of  row and  column of second matrix
        System.out.println("Enter rows of second matrix:");
        int r2 = sc.nextInt();
        System.out.println("Enter columns of second matrix:");
        int c2 = sc.nextInt();

        // 6] Initialize the second array to store second matrix
        int[][] arr1 = new int[r2][c2];
        
        // 8] Input second matrix
        System.out.println("Enter elements of second matrix:");
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // 8] Check if multiplication is possible
        // If size of column 1 of first matrix  = size of row 2 of second matrix
        if(c1 != r2) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

       
        // 9] Initialize the new array to store multiplication
        int[][] result = new int[r1][c2];

        // 10] Matrix multiplication logic
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                for(int k = 0; k < c1; k++) {
                    result[i][j] += arr[i][k] * arr1[k][j];
                }
            }
        }

        // 11] Print result matrix
        System.out.println("Resultant Matrix:");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
