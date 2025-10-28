import java.util.Scanner;
public class Swap{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Before Swap the value of a and b");
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        int temp=a;
         a=b;
         b=temp;
         System.out.println("After Swap the value of a is "+a+ " and b is "+b);
        
        
        
    }
}