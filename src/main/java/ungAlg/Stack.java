package ungAlg;


public class Stack {
	int max; // 스택 용량
	int idx; // 스택 idx
	int[] stk; // 스택의 본체

	public Stack(int capacity) {
		this.idx = 0;
		this.max = capacity;
		
		try {
			stk = new int[max];
		} catch (Exception e) {
			System.out.println("용량이 가득 찼습니다");
			max = 0;
		}
	}

//실행시 예외: 스택이 비어 있음

//실행시 예외: 스택이 가득참

}