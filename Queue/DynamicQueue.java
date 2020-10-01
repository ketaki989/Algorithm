package Queue;

public class DynamicQueue extends CircularQueue{
	
	@Override
	public void add(int item) {
		if(isFull()){
			int[] temp = new int[this.data.length*2];
			for(int i  = 0 ; i < size; i++){
				temp[i] = this.data[(front+i)%this.data.length];
			}
			this.data = temp;
		}
		
		super.add(item);
	}
}

// 1 2 3 4 6
//       e f

// 6+1 = 7/10 = 0