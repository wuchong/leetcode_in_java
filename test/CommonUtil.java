import java.util.Arrays;
import java.util.List;


public class CommonUtil {

	public static String listToString(List<String> list){
		return Arrays.toString(list.toArray());
	}

	
	public static String arrayToString(char[] ary){
		StringBuilder sb = new StringBuilder();
		for(char s : ary){
			sb.append(s);
		}
		return sb.toString();
	}
	
	public static String arrayToString(char[][] ary){
		StringBuilder sb = new StringBuilder("[");
    	int m = ary.length;
    	int n = ary[0].length;
    	for(int i=0;i<m;i++){
    		sb.append(arrayToString(ary[i]));
    		sb.append(",");
    	}
    	sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		return sb.toString();
	}
	
	public static String linkedlistToString(ListNode head){
		StringBuilder sb = new StringBuilder("[");
		ListNode p = head;
		while(p != null){
			sb.append(p.val);
			sb.append(",");
			p = p.next;
		}
		if(head != null) sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		return sb.toString();
	}
	
	public static ListNode createLinkedList(int[] ary){
		if(ary.length == 0)	return null;
		ListNode head = new ListNode(ary[0]);
		ListNode pre = head;
		for(int i=1;i<ary.length;i++){
			ListNode node = new ListNode(ary[i]);
			pre.next = node;
			pre = node;
		}
		return head;
	}
	
	

}
