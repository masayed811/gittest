import java.util.Scanner;

public class PrimeNumber {


    public static boolean prime(int n) {

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner( System.in );
        System.out.println("Enter number");
        int n = s.nextInt();
       if (prime( n ) ){
           System.out.println("number is prime");
    }
       else {
           System.out.println("number is not prime ");}
    }
}
