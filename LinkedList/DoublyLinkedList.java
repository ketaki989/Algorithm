package LinkedList;

import java.util.Scanner;

public class DoublyLinkedList {

	static class Node {
		int data;
		Node next, prev;
		Node(int data){
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	static Node start, q, temp;
	public static void createNode(int data){
		temp = new Node(data);
	}
	
	public static void insertNode(int data){
		createNode(data);
		if(start == null){
			start = temp;
		}else{
			q = start;
			while(q.next != null){
				q = q.next;
			}
			q.next = temp;
			temp.prev = q;
		}
	}

	public static void insertAtBeg(int data){
		createNode(data);
		temp.next = start;
		start = temp;
	}
		
	public static void insertAtEnd(int data){
		createNode(data);
		q = start;
		while(q.next != null){
			q = q.next;
		}
		q.next = temp;
		temp.prev = q;
	}
	
	public static void displayNode(){
		
		if(start == null){
			System.out.println("List is Empty!!!");
		}else{
			q = start;
			while(q != null){
				System.out.print("|"+q.prev+"|"+q.data+"|"+q.next+"| --> ");
				q = q.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice = 'y';
		int n;
		while(choice == 'y' || choice == 'Y'){
			System.out.println("Enter n:");
			n = sc.nextInt();
			insertNode(n);
			displayNode();
			
			System.out.println("Enter n");
			n = sc.nextInt();
			insertAtBeg(n);
			displayNode();
			
			System.out.println("Enter n");
			n = sc.nextInt();
			insertAtEnd(n);
			displayNode();

			System.out.println("Continue ?");
			choice = sc.next().charAt(0);
		}
	}
}
