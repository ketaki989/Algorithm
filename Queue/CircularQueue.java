package Queue;

public class CircularQueue {
	int[] data;
	int front, end;
	int size;
	private final int DEFAULT_SIZE = 10;
	
	CircularQueue(){
		data = new int[DEFAULT_SIZE];
		front = 0;
		end = -1;
		size = 0;
	}
	
	CircularQueue(int initialSize){
		data = new int[initialSize];
		front = 0;
		end = -1;
		size = 0;
	}
	
	public void add(int item){
		if(isFull()){
			System.out.println("QUEUE IS FULL");
			return;
		}
		
		this.end = (end+1) % this.data.length;
		this.data[end] = item;
		size++;
	}
	
	public Integer remove(){
		if(isEmpty()){
			System.out.println("QUEUE IS EMPTY");
			return null;
		}
		
		int temp = this.data[front];
		this.front = (front+1)%this.data.length;
		size--;
		return temp;
	}
	
	
	public void display(){
		for(int i = 0 ; i < size; i++){
			System.out.print(this.data[(front+i)%this.data.length] + " ");
		}
		System.out.println();
	}
	
	
	
	public boolean isFull(){
		return size == this.data.length;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
}
