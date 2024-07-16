
import java.util.Scanner;

public class HCFLCF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any Number ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcf = 2;
        int hcf = 2;
        int maxNum;
        if(num1 > num2){
            maxNum = num1;
        }
        else{
            maxNum = num2;
        }
        for (int i = 2; i < maxNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
            
                if(lcf > i ){
                    lcf = i ;
                }
                if(hcf <  i ){
                    hcf = i ;
                }
            }
        }
            System.out.println(" LCF =  " + lcf + " HCF = " + hcf);
    }
}
