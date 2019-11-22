package ungAlg;

public class Stack {
	int max; // 스택 용량
	int current; // 스택 현재크기
	int[] stk; // 스택의 본체

	public Stack(int capacity) {
		this.current = 0;
		this.max = capacity;

		try {
			stk = new int[max];
		} catch (OverflowStackException e) {
			System.out.println("용량이 가득 찼습니다");
			max = 0;
		}
	}

	public int push(int n) {
		if (current == max)
			throw new OverflowStackException("스택이 가득차있습니다.");
		return stk[current++] = n;
	}

	public int pop() {
		if (current == 0)
			throw new EmptyStackException("스택이 이버있습니다");
		return stk[--current];
	}

	public int peak() {
		if (current == 0)
			throw new EmptyStackException("스택이비어있습니다");
		return stk[current - 1];
	}

	public int indexOf(int n) {
		
		for (int i = stk.length-1; i >= 0; i--) {
			if(stk[i]==n)
				return i;
		}
		return -1;
	}

	public void clear() {
		current = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return current;
	}
	
	public boolean isEmpty() {
		if(current != 0) {
		 return false;	
		}
		return true;
	}

	public boolean isFull() {
		boolean isEmpty= true ;
		if(current == 0) {
			isEmpty = false;
			return isEmpty;
		}
		return isEmpty;
	}
	
	public void dump() {
		if(current <= 0 )
			throw new EmptyStackException("스택이 비어있습니다");
		for (int i : stk) {
			System.out.println(i);
		}
	}
	
//실행시 예외: 스택이 비어 있음
	@SuppressWarnings("serial")
	public class EmptyStackException extends RuntimeException {

		public EmptyStackException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}

	}

//실행시 예외: 스택이 가득참
	@SuppressWarnings("serial")
	public class OverflowStackException extends RuntimeException {
		public OverflowStackException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}
	}
}