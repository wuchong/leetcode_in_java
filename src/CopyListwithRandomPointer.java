import java.util.HashMap;

/**
 * A linked list is given such that each node contains an additional 
 * random pointer which could point to any node in the list or null.
 * 
 * Return a deep copy of the list.
 *
 * answer: 使用hashmap，空间换时间
 */
public class CopyListwithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
    	if(head == null)	return null;
        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
        //copy list and put into hash
        RandomListNode cur = head ;
        RandomListNode copyHead = new RandomListNode(head.label);
        map.put(head, copyHead);
        RandomListNode pre = copyHead;
        cur = cur.next;
        while(cur != null){
        	RandomListNode node = new RandomListNode(cur.label);
        	map.put(cur, node);
        	pre.next = node;
        	pre = node;
        	cur = cur.next;
        }
        //copy random pointer
        cur = head;
        RandomListNode copyCur = copyHead;
        while(cur != null){
        	if(cur.random != null){
        		copyCur.random = map.get(cur.random);
        	}
        	cur = cur.next;
        	copyCur = copyCur.next;
        }
        return copyHead;
    }
}
