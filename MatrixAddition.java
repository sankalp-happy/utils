import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for Matrix 1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of columns for Matrix 1: ");
        int c1 = sc.nextInt();
        
        System.out.print("Enter the number of rows for Matrix 2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of columns for Matrix 2: ");
        int c2 = sc.nextInt();
        
        if (r1 != r2 || c1 != c2) {
            System.out.println("Matrices are not compatible for addition.");
            return;
        }
        
        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r1][c1];
        
        System.out.println("Enter elements of Matrix 1:");
        inputMatrix(m1, r1, c1, sc);
        System.out.println("Enter elements of Matrix 2:");
        inputMatrix(m2, r1, c1, sc);
        
        int[][] result = addMatrices(m1, m2, r1, c1);
        
        System.out.println("Resultant Matrix after Addition:");
        displayMatrix(result, r1, c1);
        
        sc.close();
    }
    
    public static void inputMatrix(int[][] matrix, int r, int c, Scanner sc) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    
    public static int[][] addMatrices(int[][] m1, int[][] m2, int r, int c) {
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }
    
    public static void displayMatrix(int[][] m, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
