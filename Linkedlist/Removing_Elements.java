import java.util.*;
class linkedlist1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println(l); //1 2 3
    l.remove(2);
    System.out.println(l); // 1 3
  }
}
