public class SumOfEvenOrOdd {
    public static void main(String[] args) {
        int n = 10;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i++) {
            
           
            if(i % 2 == 0){
                evenSum += i;
            }
            else{
                oddSum += i;
            }
        }
        System.out.println(" Sum of N even  number is " + evenSum);
        System.out.println(" Sum of N odd  number is " + oddSum);
    }
}
