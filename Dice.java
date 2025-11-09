 public class Dice{
    public static void main(String[]args){
        int count=0;
        {
            for(int d1=1;d1<=6;d1++)
            {
                 for(int d2=1;d2<=6;d2++) 
                 {
                     for(int d3=1;d3<=6;d3++) 
                     {
                         System.out.println(""+d1+d2+d3);
                         count++;
                     }
                 }  
            }
        }
        System.out.println("The totall Combinations is"+count);
        
    }
}