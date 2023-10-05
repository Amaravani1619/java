import java.util.Scanner;
public class MatrixAddition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();
        int a[][] = new int[r][c]; // Matrix A
        int b[][] = new int[r][c]; // Matrix B
        int result[][] = new int[r][c]; // Resultant Matrix
        System.out.println("Enter " + (r * c) + " elements into the matrix A: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter " + (r * c) + " elements into matrix B: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        // Perform matrix addition
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        // Display the result matrix
        System.out.println("The resultant matrix is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
