
import java.util.Scanner;

public class FactOfN {
    public static void main(String[] args) {
        int n;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1 ; i <= 5; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
