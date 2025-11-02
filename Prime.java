import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            int count = 0;

           
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count = 1; 
                    break;
                }
            }

            if (count == 0) {
                System.out.println(i + " ");
            }
        }

        sc.close();
    }
}