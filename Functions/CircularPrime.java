import java.util.Scanner;

public class CircularPrime {

    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function to count digits
    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // Function to check if number is circular prime
    static boolean isCircularPrime(int num) {
        int count = countDigits(num);
        int n = num;

        // Precompute multiplier (10^(count-1))
        int mult = 1;
        for (int i = 1; i < count; i++) {
            mult *= 10;
        }

        for (int i = 0; i < count; i++) {
            if (!isPrime(n)) return false;

            // Rotate number
            int r = n % 10;
            n = (n / 10) + (r * mult);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (isCircularPrime(num))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
