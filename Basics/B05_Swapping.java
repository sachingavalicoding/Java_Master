
public class B05_Swapping {

    public static void main(String[] args) {
        int a = 10;

        int b = 20;
        int temp;
        System.out.println(" Before swap A = " + a + " B = " + b);
        // swap 
        temp = a;
        a = b;
        b = temp;
        System.out.println(" After swap A = " + a + " B = " + b);

    }
}
