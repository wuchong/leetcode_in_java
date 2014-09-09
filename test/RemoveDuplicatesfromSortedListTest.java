import static org.junit.Assert.*;

import org.junit.Test;


public class RemoveDuplicatesfromSortedListTest {

	@Test
	public void test() {
		int[] input = {1,1,2};
		int[] output = {1,2};
		ListNode head = CommonUtil.createLinkedList(input);
		ListNode expected = CommonUtil.createLinkedList(output);
		
		RemoveDuplicatesfromSortedList a = new RemoveDuplicatesfromSortedList();
		AssertUtil.assertLinkedListEquals(expected,a.deleteDuplicates(head));
	}
	
	@Test
	public void test2() {
		int[] input = {1,1,2,3,3};
		int[] output = {1,2,3};
		ListNode head = CommonUtil.createLinkedList(input);
		ListNode expected = CommonUtil.createLinkedList(output);
		
		RemoveDuplicatesfromSortedList a = new RemoveDuplicatesfromSortedList();
		AssertUtil.assertLinkedListEquals(expected,a.deleteDuplicates(head));
	}
	
	@Test
	public void test3() {
		int[] input = {1,2};
		int[] output = {1,2};
		ListNode head = CommonUtil.createLinkedList(input);
		ListNode expected = CommonUtil.createLinkedList(output);
		
		RemoveDuplicatesfromSortedList a = new RemoveDuplicatesfromSortedList();
		AssertUtil.assertLinkedListEquals(expected,a.deleteDuplicates(head));
	}

	
	@Test
	public void test4() {
		int[] input = {1};
		int[] output = {1};
		ListNode head = CommonUtil.createLinkedList(input);
		ListNode expected = CommonUtil.createLinkedList(output);
		
		RemoveDuplicatesfromSortedList a = new RemoveDuplicatesfromSortedList();
		AssertUtil.assertLinkedListEquals(expected,a.deleteDuplicates(head));
	}
	
	
	@Test
	public void test5() {
		int[] input = {};
		int[] output = {};
		ListNode head = CommonUtil.createLinkedList(input);
		ListNode expected = CommonUtil.createLinkedList(output);
		
		RemoveDuplicatesfromSortedList a = new RemoveDuplicatesfromSortedList();
		AssertUtil.assertLinkedListEquals(expected,a.deleteDuplicates(head));
	}
	
}
