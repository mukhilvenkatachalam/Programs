import java.util.Scanner;

public class SlidingWindowMax {

    static int getMax(int[] arr, int start, int k) {
        int maxm = arr[start];
        for (int i = start; i < start + k; i++) {
            if (arr[i] > maxm) {
                maxm = arr[i];
            }
        }
        return maxm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int i = 0; i <= n - k; i++) {
            System.out.print(getMax(arr, i, k) + " ");
        }
    }
}
