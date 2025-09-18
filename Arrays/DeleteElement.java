public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;
        int pos = 2; 

        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--; 
		
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
