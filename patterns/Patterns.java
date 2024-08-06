
class Patterns {

    public static void main(String[] args) {

        /*
         
         * * * *
         * * * *
         * * * *
         * * * *
         
         */

        for(int i = 0; i < 4 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }


          /*
         
         * * * *
         * * *
         * * 
         * 
         
         */
/* 
         for(int i =0 ; i < 4 ; i++){
            for( int j = 0 ; j < 4 - i  ; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
         } */




          /*
         
         * 
         * * 
         * * *
         * * * * 
         
         */
/* 
         for(int i = 0; i < 4 ; i++){
            for(int j = 0 ; j <= i ; j++){  
                System.out.print(" * ");
            }
            System.out.println(" ");
        } 
            */

       /*      for(int i = 1; i <= 4 ; i++){
                for(int j = 0 ; j < i ; j++){
                    System.out.print(" * ");
                }
                System.out.println(" ");
            }
        */

        /* 
         
         1 2 3 4 
         1 2 3 
         1 2 
         1

         */

      /*    for(int i = 0; i < 4 ; i++){
            for(int j = 1 ; j <= 4 - i  ; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        } */


        /* 
         4
         4 3 
         4 3 2 
         4 3 2 1 

         */

   /*      for(int i = 0; i < 4 ; i++){
            for(int j = 0 ; j <=  i ; j++){
                System.out.print(4 - j + " ");
            }
            System.out.println(" ");
        } 
    }
            */
    
        /* 
         1 1 1 1
         2 2 2 
         3 3
         4 

         */

         

      /*   for(int i = 0; i < 4 ; i++){
            for(int j = i ; j < 4 ; j++){
                System.out.print(  i + 1  + " ");
            }
            System.out.println(" ");
        }
    } */
        /* 
         1 2 3 4
         5 6 7
         8 9
         10

         */

 /*         
        int x = 1 ; 
        for(int i = 0; i < 4 ; i++){
            for(int j = i ; j < 4 ; j++){
                System.out.print(  x + i  + " ");
            }
            System.out.println(" ");
        } */


        /* 

         * 
         * *
         * * * 
         * * * * 
         * * * * 
         * * * 
         * *
         * 
         
         */
   /*      for(int i = 0; i < 4 ; i++){
            for( int j = 0 ; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for(int i = 0; i < 4 ; i++){
            for( int j = 0 ; j < 4 - i; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        } */

        // for(int i = 0; i < 4 ; i++){
        //     for( int j = 0 ; j <= i; j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println(" ");
        // }

    }
}
