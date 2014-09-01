import static org.junit.Assert.*;

import org.junit.Test;


public class LongestConsecutiveSequenceTest {

	@Test
	public void test() {
		int[] num = {100, 4, 200, 1, 3, 2};
		LongestConsecutiveSequence o = new LongestConsecutiveSequence();
		assertEquals(4, o.longestConsecutive(num));
	}
	
	@Test
	public void test2() {
		int[] num = {10000, 4, 9999, 1, 3, 2};
		LongestConsecutiveSequence o = new LongestConsecutiveSequence();
		assertEquals(4, o.longestConsecutive(num));
	}
	
	@Test
	public void test3() {
		int[] num = {1,3,5,7,9};
		LongestConsecutiveSequence o = new LongestConsecutiveSequence();
		assertEquals(1, o.longestConsecutive(num));
	}
	
	@Test
	public void test4() {
		int[] num = {0,0};
		LongestConsecutiveSequence o = new LongestConsecutiveSequence();
		assertEquals(1, o.longestConsecutive(num));
	}

}
