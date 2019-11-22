package ungAlg;

public class Stack {
	int max; // ���� �뷮
	int current; // ���� ����ũ��
	int[] stk; // ������ ��ü

	public Stack(int capacity) {
		this.current = 0;
		this.max = capacity;

		try {
			stk = new int[max];
		} catch (OverflowStackException e) {
			System.out.println("�뷮�� ���� á���ϴ�");
			max = 0;
		}
	}

	public int push(int n) {
		if (current == max)
			throw new OverflowStackException("������ �������ֽ��ϴ�.");
		return stk[current++] = n;
	}

	public int pop() {
		if (current == 0)
			throw new EmptyStackException("������ �̹��ֽ��ϴ�");
		return stk[--current];
	}

	public int peak() {
		if (current == 0)
			throw new EmptyStackException("�����̺���ֽ��ϴ�");
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
			throw new EmptyStackException("������ ����ֽ��ϴ�");
		for (int i : stk) {
			System.out.println(i);
		}
	}
	
//����� ����: ������ ��� ����
	@SuppressWarnings("serial")
	public class EmptyStackException extends RuntimeException {

		public EmptyStackException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}

	}

//����� ����: ������ ������
	@SuppressWarnings("serial")
	public class OverflowStackException extends RuntimeException {
		public OverflowStackException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}
	}
}