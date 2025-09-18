import java.util.Scanner;

public class Permutation {

    public static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact(n - 1);
    }
]
    public static int perm(int n, int r) {
        return fact(n) / fact(n - r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(perm(n, r));
    }
}
