
public class Sample {

    public static void main(String[] args) {

        // convert number into string in linear order 123 = 1 2 3 

        /*   int n = 10; 
        // 1 to n sum 
        int sum = 0;
        int i;
        for( i = 1 ; i <= n ; i++){ 
                   
        }
        System.out.println(" Sum = " + sum );
        System.out.println(" I = " + i );
        sum = sum + i;
        System.out.println(" Sum = " + sum ); */
        // number convert to  string 
        /*    int n = 123;

        while(n > 0 ){
            int rem = n % 10; // 123 % 10 = 3 
            
              switch (rem) {
                case 0 -> System.out.println(" Zero ");
                case 1 -> System.out.println(" one  ");
                case 2 -> System.out.println(" Two ");
              
                case 3 -> System.out.println(" Three ");
              
                case 4 -> System.out.println(" Four ");
              
                case 5 -> System.out.println(" Five ");
              
                default -> { System.out.println(" Not a Number ");
                }
              }

            n = n / 10;
        }
         */
 /*     int n = 123;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10; // 123 % 10 = 3 // 12 % 10 = 2 // 1 % 10 = 1 
            sum = (sum * 10) + rem; // 0 * 10 + 3 = 3  // 3 * 10 + 2 // 32 * 10 + 1 = 321 
            n = n / 10;
        }
        System.out.print(sum + " "); */
 /*   
      // panlindrome  121 = 121 // 1288 = 8821 // 4554 = 4554
        int n = 4554;
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10; 
            sum = (sum * 10) + rem; 
            n = n / 10;
        }
        if(temp == fullNum){
            System.out.print(sum + " It is a palindrome number"); 
        }
        else{
            System.out.println(" Not a palindrome number ");
        } 
         */
        // amstrong number 153 = 1  + 125 + 27 =  153 
        /* int n = 123;
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10; 
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        if(temp == sum){
            System.out.print(sum + " It is a Amstrong number"); 
        }
        else{
            System.out.println(" Not a amstrong number ");
        } 
         */
        // factors 4 = 1, 2, 4 
        /*  int n = 12 ;
        for(int i = 1; i <= n; i++ ){
            if(n % i == 0 ){
                System.err.println(i);
            }
        } */
       /*  int n = 496; // 5 * 4 * 3 * 2 * 1 = 120  // perfect number 
        int factSum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                factSum = factSum + i;
            }
        } */
     
      /*   int n = ; // prime number 
        boolean isPrime = true ;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        
        if(isPrime == true){
            System.out.println(" Is prime number ");
        }
        else{
            System.out.println(" Not a Prime number ");
        } */

    }
}
