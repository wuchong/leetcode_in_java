import static org.junit.Assert.*;

import org.junit.Test;


public class MergeTwoSortedListsTest {

	@Test
	public void test() {
		int[] list1 = {1,4,8,11};
		int[] list2 = {2,3,5,6,9};
		int[] list = {1,2,3,4,5,6,8,9,11};
		ListNode l1 = CommonUtil.createLinkedList(list1);
		ListNode l2 = CommonUtil.createLinkedList(list2);
		ListNode expected = CommonUtil.createLinkedList(list);
		MergeTwoSortedLists a = new MergeTwoSortedLists();
		AssertUtil.assertLinkedListEquals(expected, a.mergeTwoLists(l1, l2));
	}

	@Test
	public void test2() {
		int[] list1 = {1};
		int[] list2 = {};
		int[] list = {1};
		ListNode l1 = CommonUtil.createLinkedList(list1);
		ListNode l2 = CommonUtil.createLinkedList(list2);
		ListNode expected = CommonUtil.createLinkedList(list);
		MergeTwoSortedLists a = new MergeTwoSortedLists();
		AssertUtil.assertLinkedListEquals(expected, a.mergeTwoLists(l1, l2));
	}



}
