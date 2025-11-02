import java.util.Scanner;
public class Amstro{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int Num=sc.nextInt();
        int orginal=Num;
        int count=0;
        int sum=0;
        int temp=Num;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        temp=Num;
        while(temp>0){
            int digit=temp%10;
            sum+=(int)Math.pow(digit,count);
            temp=temp/10;
        }
        if(sum==orginal){
            System.out.println(+Num+" Number is Amstrong Number");
        }
        else{
        System.out.println(+Num+" Number is  Not Amstrong Number");
    }
}
}