import java.util.Scanner;

public class Swap2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows and columns
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] array = new int[row][col];

        // Input elements
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Display original array
        System.out.println("\nOriginal Array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Swap rows: first with last, second with second last, etc.
        for (int i = 0; i < row / 2; i++) {
            for (int j = 0; j < col; j++) {
                int temp = array[i][j];
                array[i][j] = array[row - 1 - i][j];
                array[row - 1 - i][j] = temp;
            }
        }

        // Display array after swapping
        System.out.println("\nArray After Swapping Rows:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}