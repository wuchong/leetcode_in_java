/**
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 * answer: 链表操作题,使用dummy head，简化操作
 */
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)	return l2; 			// check null
		if (l2 == null)	return l1;
		ListNode head = new ListNode(-1); 	// dummy head
		ListNode node = head; 				// merge
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				node.next = l1;
				l1 = l1.next;
			} else {
				node.next = l2;
				l2 = l2.next;
			}
			node = node.next;
		}
		node.next = l1 != null ? l1 : l2; 	// connect the rest
		return head.next;
	}
}
