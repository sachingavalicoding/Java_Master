


class Practice {

    public static void main(String[] args) {
        // int num = 15;
        // int oddSum = 0;
        // for (int i = 1; i <= num; i++) {
        //     if (i % 2 != 0) {
        //         oddSum = oddSum + i; //
        //     }
        // }

        // System.out.println(oddSum);
        // // factors of an number 
        // int n = 45; // 1 , 2 , 3 ,4 ,6 12 
        // // int n2 = 25; // 1, 5 , 25 
        // // int n3 = 7 ; // 1, 7 
        // for(int i = 1 ; i <= n ; i++){
        //     if(n % i == 0){ 
        //         System.out.println(i);
        //     }
        // }
        // prime number 
        // 2 , 3 , 5 ,7 ,11 

        
        int n = 7;
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {  // 6<7 true   7 < 7 
            if (n % i == 0 ) {  // 12 % 2 == 0 
                isPrime = false;
                
            }
        }

    }
}
