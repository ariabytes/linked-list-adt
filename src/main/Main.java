package main;
import java.util.Scanner;
import singly_linked_list.Node;
import singly_linked_list.SinglyLinkedList;
import singly_linked_list.SinglyLinkedListInterface;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SinglyLinkedListInterface s = new SinglyLinkedList();
		
		String input = sc.nextLine();
		s.addFirst(input);
		
		System.out.println(s.getFirst());
		

	}

}
