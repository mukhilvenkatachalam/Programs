import java.util.*;
class linkedlist1{
	public static void main(String[] args){
  LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		Object[] o = l.toArray();
		for(Object num : o){
			System.out.print(num+" ");
		}
		
	}
}
