import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any Number ");
        int n = sc.nextInt();
        int factSum = 0;
        for(int i = 1 ; i < n ; i++){
            if(n % i == 0){
                factSum += i ;
            }
        }
        if(factSum == n ){
            System.out.println(" Perfect Number ");
        }
    }
}
