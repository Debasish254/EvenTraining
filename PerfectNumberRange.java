import java.util.Scanner;
public class PerfectNumberRange {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Enter the Number:");
     n = sc.nextInt();

        System.out.println("Perfect numbers are "+n);

        for (int i =1; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}


