package ungAlg;


public class Stack {
	int max; // ���� �뷮
	int idx; // ���� idx
	int[] stk; // ������ ��ü

	public Stack(int capacity) {
		this.idx = 0;
		this.max = capacity;
		
		try {
			stk = new int[max];
		} catch (Exception e) {
			System.out.println("�뷮�� ���� á���ϴ�");
			max = 0;
		}
	}

//����� ����: ������ ��� ����

//����� ����: ������ ������

}