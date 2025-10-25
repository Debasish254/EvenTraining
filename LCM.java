import java.util.Scanner;
public class LCM{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Two value");
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        int max=(a>b)?a:b;
        while(true){
            if(max%a==0 && max%b==0)
            {
                System.out.println("LCM= "+max);
                break;
            }
            max++;
        }
        
    }}
        
        
      