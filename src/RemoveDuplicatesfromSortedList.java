/**
 * Given a sorted linked list, delete all duplicates 
 * such that each element appear only once.
 * 
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * answer: 基本链表操作题
 */
public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;        
    	ListNode pre = head;
        ListNode cur = pre.next;
        while(cur != null){
        	if(cur.val == pre.val){		//delete  cur
        		pre.next = cur.next;
        		cur = pre.next;
        	}else{
        		pre = cur;
        		cur = cur.next;
        	}
        }
    	return head;
    }
}
