package LinkedList;

import java.util.Scanner;

public class SimpleLinkedList {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	static Node start, q, temp;
	
	public static void createLinkedList(int data){
		temp = new Node(data);
		if(start == null){
			start = temp;
		}else{
			q = start;
			while(q.next != null){
				q = q.next;
			}
			q.next = temp;
		}
	}
	
	public static void displayLinkedList(){
		if(start == null){
			System.out.println("LinkedList is empty!!!!");
		}else{
			q = start;
			while(q != null){
				System.out.print(q.data+" -->");
				q = q.next;
			}
			System.out.println();
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n;
		char choice = 'y';
		start = null;
		while(choice == 'y' || choice == 'Y'){
			System.out.println("Enter a number :");
			n = sc.nextInt();
			createLinkedList(n);
			displayLinkedList();
			System.out.println("Continue ?");
			choice = sc.next().charAt(0);
		}
	}
}
