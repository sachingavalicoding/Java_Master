
public class PrintDigit {

    public static void main(String[] args) {
        int n = 123;
        int rem;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            switch (rem) {
                case 0 -> System.out.print( " " + " Zero");
                case 1 -> System.out.print( " " + " One");
                case 2 -> System.out.print( " " + " Two");
                case 3 -> System.out.print( " " + " Three");
                case 4 -> System.out.print( " " + " Four");
                case 5 -> System.out.print( " " + " Five");
                case 6 -> System.out.print( " " + " Six");
                case 7 -> System.out.print( " " + " Seven");
                case 8 -> System.out.print( " " + " Eight");
                case 9 -> System.out.print( " " + " Nine");
                default -> {
                }
            }

        }
    }
}
