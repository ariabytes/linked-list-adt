package main;
import java.util.Scanner;
import singly_linked_list.Node;
import singly_linked_list.SinglyLinkedList;
import singly_linked_list.SinglyLinkedListInterface;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SinglyLinkedListInterface s = new SinglyLinkedList();
		System.out.println(s.size());
		s.addFirst("balay ni mayang");
		
		System.out.println(s.size());
		s.add(1, "nicki minaj");
		s.add(2, "anaconda");
		s.add(3, "ahhhh");
		s.add(4, "mark");
		s.add(5, "wowow");
		s.add(6, "tail");
		s.addLast("last");
		
		System.out.println(s.getFirst());
		System.out.println(s.getLast());
		System.out.println(s.get(1));
		System.out.println(s.indexOf("ahhhh"));
		
		System.out.println(s.toString());
		
		s.removeLast();

		System.out.println(s.toString());
		
		s.removeFirst();

		System.out.println(s.toString());
		
		s.add(3, "index 3");
		s.add(5, "index 5");


		System.out.println(s.toString());
		System.out.println(s.size());

		
	}

}
