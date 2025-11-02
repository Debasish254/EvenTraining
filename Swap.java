import java.util.Scanner;
public class Swap{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Before Swap the value of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=a;
         a=b;
         b=temp;
         System.out.println("After Swap the value of a is "+a+ " and b is "+b);
        
        
        
    }
}