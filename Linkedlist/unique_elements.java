import java.util.*;
class linkedlist1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<5;i++){
			arr[i] = sc.nextInt();
		}
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(int num : arr){
			ll.add(num);
		} 
		HashSet<Integer> h = new HashSet<>(ll);
		System.out.println(h);
		
	}
}
