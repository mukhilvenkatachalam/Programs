import java.util.*;
class linkedlist1{
	public static void main(String[] args){
  LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
// for loop
		for(int i=0;i<l.size();i++){
			System.out.print(l.get(i)+" ");
		}
		System.out.println(" ");
// for-each loop
		for(int num:l){
			System.out.print(num+" ");
		}
	}
}
