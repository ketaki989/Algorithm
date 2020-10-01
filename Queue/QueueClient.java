package Queue;

import java.util.Arrays;

public class QueueClient {
	
	public static void main(String args[]){
		CircularQueue cqueue = new CircularQueue();
		for(int i = 0 ; i < 10; i++){
			cqueue.add(i);
		}
		System.out.println("--------------------------------");
		cqueue.display();
		System.out.println("Removed Circular Queue::"+cqueue.remove());
		cqueue.display();
		

		System.out.println("--------------------------------");
		cqueue.display();
		System.out.println("Removed Circular Queue::"+cqueue.remove());
		cqueue.display();
		

		System.out.println("--------------------------------");
		cqueue.display();
		System.out.println("Removed Circular Queue::"+cqueue.remove());
		cqueue.display();
		

		System.out.println("--------------------------------");
		cqueue.display();
		System.out.println("Removed Circular Queue::"+cqueue.remove());
		cqueue.display();
		
//		DynamicQueue dQueue = new DynamicQueue();
//		for(int i = 0 ; i < 112; i++){
//			dQueue.add(i);
//		}
//		System.out.println("::::Before::::");
//		dQueue.display();
//		System.out.println("Removed Element Dynamic Queue: "+dQueue.remove());
//		System.out.println("Removed Element Dynamic Queue: "+dQueue.remove());
//		System.out.println("::::After::::");
//		dQueue.display();		
	}
}
