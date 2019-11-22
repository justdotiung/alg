package ungAlg;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgTest {
	@Test
	public void stackTest() throws Exception {
		int[] testArr = {19}; 
		
		Stack s = new Stack(1);
		
		s.push(19);
		assertEquals(19, s.peak());
		//s.pop();
		assertTrue(s.isFull());
		assertEquals(1, s.size());
	}
	@Test
	public void queTest() throws Exception {
		int[] testArr = {19};
		Queue que = new Queue(1);
		assertEquals(10, que.arr[0]);
		
		assertEquals(1, que.size());
		
		//assertEquals(expected, actual);
		
	}
}
