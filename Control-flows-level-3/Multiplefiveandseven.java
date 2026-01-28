import java.util.*;

public class Multiplefiveandseven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n == m){
            System.out.println("Both numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }
    }
}