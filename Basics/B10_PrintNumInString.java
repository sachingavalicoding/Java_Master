
import java.util.Scanner;

public class B10_PrintNumInString {
    public static void main(String[] args) {
        int num , rem  ;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number ");
        num = sc.nextInt();
        while(num > 0 ){
             rem  = num % 10 ;
             switch(rem){
               case 0 ->  {
                System.out.print(" Zero ");
               }
               case 1 ->  {
                System.out.print(" One ");
               }
               case 2 ->  {
                System.out.print(" Two ");
               }
               case 3 ->  {
                System.out.print(" Three ");
               }
               case 4 ->  {
                System.out.print(" Four ");
               }
               case 5 ->  {
                System.out.print(" Five ");
               }
               case 6 ->  {
                System.out.print(" Six ");
               }
               case 7 ->  {
                System.out.print(" Seven ");
               }
               case 8 ->  {
                System.out.print(" eight ");
               }
               case 9 ->  {
                System.out.print(" Nine ");
               }
             }
             num = num / 10;
        }
    }
}
