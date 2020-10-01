package Queue;
import java.util.*;
public class PriorityQueue {
	
	static class Node{
		int data;
		int priority;
		Node next;
		Node(int data, int priority){
			this.data = data;
			this.priority = priority;
		}
	}
	static Node front, temp , q , ptr;
	public static void insertNode(int data, int prio){
		temp = new Node(data, prio);
		if(front == null || prio < front.priority){
			temp.next = front;
			front = temp;
		}else{
			q = front;
			while(q.next != null && q.next.priority <= prio){
				q = q.next;
			}
			temp.next = q.next;
			q.next = temp;
		}
	}
	
	public static void deleteNode(){
		if(front == null){
			System.out.println("Queue is Empty!!!");
		}else{
			temp = front;
			front = front.next;
		}
	}
	
	public static void display(){
		ptr = front;
		if(front == null){
			System.out.println("Queue is Empty!!!");
		}else{
			System.out.println("Data\tPriority\n");
			while(ptr != null){
				System.out.println(ptr.data+"\t"+ptr.priority);
				ptr = ptr.next;
			}
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char choice = 'y';
		int ch, n, prio;
		while(true){
			System.out.println("1. Insert\n2.Delete\n3.Display\n4.Exit");
			System.out.println("Enter your choice :");
			ch = sc.nextInt();
			
			switch(ch){
			case 1:
					choice = 'y';
					while(choice == 'y' || choice == 'Y'){
						System.out.println("Enter a number and priority :");
						n = sc.nextInt();
						prio = sc.nextInt();
						insertNode(n, prio);
						display();
						System.out.println("Continue ?");
						choice = sc.next().charAt(0);
					}
				break;
			case 2:
					choice = 'y';
					while(choice == 'y' || choice == 'Y'){
						deleteNode();
						display();
						System.out.println("Continue ?");
						choice = sc.next().charAt(0);
					}
				break;
			case 3:
					display();
				break;
			case 4:
					System.exit(0);
				break;
			}
		}
	}
}
