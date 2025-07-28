import java.util.Scanner;

public class WierdAlgo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(n);
        while (n != 1) {
            if ((n & 1) == 0) {
                n = n >> 1; 
            } 
            else {
                n = 3 * n + 1;
            }
            System.out.print(" " + n);
        }
        System.out.println();
        sc.close();
    }
}