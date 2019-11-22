package ungAlg;

public class Queue {
	int[] arr;
	int max;
	int front;
	int rear;
	int num;
	public Queue(int capacity) {
		front = rear = num = 0;
		this.max = capacity;
		try {
			this.arr= new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public void push(int i) {
		arr[num++] = i;
	}

	public int size() {
		// TODO Auto-generated method stub
		return max;
	}
	
	
}
