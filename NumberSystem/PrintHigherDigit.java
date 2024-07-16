
public class PrintHigherDigit {

    public static void main(String[] args) {
        int n = 123;
        int MaxDigit = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            if(MaxDigit < rem){
                MaxDigit = rem;
            }
        }
        System.out.println(" Max Digit is = " + MaxDigit);
    }
}
