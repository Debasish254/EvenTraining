import java.util.Scanner;
public class Neon{
    public static void main (String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Value Of N");
    int n= sc.nextInt();
    int Square=n*n;
    int temp=Square;
   for (int i = 2; i <= n; i++) {
    int sum=0;

    while(temp!=0)
    {
        int r=temp%10;
         sum=sum+r;
        temp=temp/10;
    }
    if(sum==n);
    System.out.println(i+"neon number are:");
}
}
}