import java.util.Scanner;
public class ArrayiiD {
    public static void main(String[] args) {
  int row,col,n;
   Scanner Sc=new Scanner(System.in);
   System.out.println("Enter the row:");
   row=Sc.nextInt();
   System.out.println("Enter the col:");
   col=Sc.nextInt();
  int array[][]=new int[row][col];
  for (int i = 0; i < row; i++) {
   for (int j = 0; j < col; j++) {       
               array[i][j]=Sc.nextInt();
            }
        }
            
        for (int i = 0; i < row; i++) {
          for (int j = 0; j < col; j++) {
                if (i==0 || i==array.length-1) {
                    System.out.print(array[i][j] + " ");
 
                }
                else{
                    System.out.print(""+"x ");
                }   
                
            }
            System.out.println();
    }
}}