/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * 
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * 
 * Your algorithm should use only constant space. You may not modify 
 * the values in the list, only nodes itself can be changed.
 *
 * answer: Á´±í²Ù×÷Ìâ
 */

public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)	return head;
        ListNode newHead = new ListNode(-1);	//dummy
        ListNode pre = newHead;	
        ListNode cur = head;
        while(cur != null && cur.next != null){
        	ListNode next = cur.next;
        	//swap
        	pre.next = next;
        	cur.next = next.next;
        	next.next = cur;
        	//move forward
        	pre = cur;
        	cur = cur.next;
        }
        return newHead.next;
    }
}
