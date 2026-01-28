import java.util.*;

public class Abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                sum = sum + i;
            }
        }

        if(sum > n) {
            System.out.println("abundant number");
        } else {
            System.out.println("not an abundant no");
        }
    }
}