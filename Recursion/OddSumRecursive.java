import java.util.Scanner;

public class OddSumRecursive {

    // Recursive function to sum odd elements
    static int oddSum(int[] arr, int n) {
        if (n == 0) return 0; 
		
        int last = (arr[n - 1] % 2 != 0) ? arr[n - 1] : 0;

        return last + oddSum(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(oddSum(arr, n));
    }
}
