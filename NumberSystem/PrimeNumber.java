import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any Number ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2 ; i < n ; i++){
            if(n % i == 0){
                isPrime = false;
            }
        }
        if(isPrime == true ){
            System.out.println(" Prime Number ");
        }
        else{
            System.out.println(" Not a Prime Number ");
        }
    }
}
