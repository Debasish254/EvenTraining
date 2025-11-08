import java.util.Scanner;
public class FirstAndLast2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nThe array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nFirst and Last Row:");
        for (int i = 0; i < row; i++) {
            if (i == 0 || i == row - 1) { 
                for (int j = 0; j < col; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}