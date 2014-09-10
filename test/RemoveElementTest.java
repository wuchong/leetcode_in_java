import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;


public class RemoveElementTest {

	@Test
	public void test() {
		int[] A = {1,2,2,3,5,2};
		int[] expected = {1,5,3,2,2,2};
		RemoveElement a = new RemoveElement();
		assertEquals(3, a.removeElement(A, 2));
//		assertEquals(Arrays.toString(expected), Arrays.toString(A));
		System.out.println(Arrays.toString(A));
	}
	
	
	@Test
	public void test2() {
		int[] A = {1,2,2,2};
		int[] expected = {1,2,2,2};
		RemoveElement a = new RemoveElement();
		assertEquals(1, a.removeElement(A, 2));
//		assertEquals(Arrays.toString(expected), Arrays.toString(A));
		System.out.println(Arrays.toString(A));
	}
	
	
	@Test
	public void test3() {
		int[] A = {1};
		int[] expected = {1};
		RemoveElement a = new RemoveElement();
		assertEquals(1, a.removeElement(A, 2));
//		assertEquals(Arrays.toString(expected), Arrays.toString(A));
		System.out.println(Arrays.toString(A));
	}
	
	@Test
	public void test4() {
		int[] A = {1};
		int[] expected = {1};
		RemoveElement a = new RemoveElement();
		assertEquals(0, a.removeElement(A, 1));
//		assertEquals(Arrays.toString(expected), Arrays.toString(A));
		System.out.println(Arrays.toString(A));
	}

}
