import static org.junit.Assert.*;

import org.junit.Test;


public class SwapNodesinPairsTest {

	@Test
	public void test() {
		int[] input = {1,2,3,4};
		int[] output = {2,1,4,3};
		ListNode head = CommonUtil.createLinkedList(input);
		ListNode expected = CommonUtil.createLinkedList(output);
		
		SwapNodesinPairs a = new SwapNodesinPairs();
		AssertUtil.assertLinkedListEquals(expected, a.swapPairs(head));
		
	}

	@Test
	public void test2() {
		int[] input = {1};
		int[] output = {1};
		ListNode head = CommonUtil.createLinkedList(input);
		ListNode expected = CommonUtil.createLinkedList(output);
		
		SwapNodesinPairs a = new SwapNodesinPairs();
		AssertUtil.assertLinkedListEquals(expected, a.swapPairs(head));
		
	}
	
	@Test
	public void test3() {
		int[] input = {1,2,3,4,5};
		int[] output = {2,1,4,3,5};
		ListNode head = CommonUtil.createLinkedList(input);
		ListNode expected = CommonUtil.createLinkedList(output);
		
		SwapNodesinPairs a = new SwapNodesinPairs();
		AssertUtil.assertLinkedListEquals(expected, a.swapPairs(head));
		
	}
}
