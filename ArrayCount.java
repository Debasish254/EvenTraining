import java.util.Scanner;
public class ArrayCount{
 public static void main (String[]args){
     Scanner sc=new Scanner(System.in);
     int arr[]={60,50,40,40,30,20,80,20,20};
    int length=arr.length;
     int key=sc.nextInt();
        int count=0;
     for(int i=0;i<length;i++){
       if(key==arr[i]){
       count++;
       
    
    }
    
}
System.out.println("My key value is " +count+" times appears"); 
}
}
 