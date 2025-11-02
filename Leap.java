import java.util.Scanner;
public class Leap{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int n=sc.nextInt();
        if(n%400==0||(n%4==0)&&(n%100!=0)){
        
           System.out.println(" Leap year");
        }
           else{
                System.out.println(" Not Leap year");
           }
       
            
        }
    }
