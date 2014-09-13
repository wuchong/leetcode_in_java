import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class CommonUtil {

	public static <E> String listToString(List<E> list){
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
	
	public static TreeNode buildTree(String[] ary){
		if(ary == null || ary.length <= 0 || ary[0].equals("#"))
			return null;
		LinkedList<TreeNode> q = new LinkedList<>();
		TreeNode root = new TreeNode(Integer.parseInt(ary[0]));
		q.offer(root);
		int i=1;
		while(!q.isEmpty()){
			TreeNode node = q.poll();
			node.left = createTreeNode(ary,i++);
			node.right = createTreeNode(ary,i++);
			if(node.left != null) q.offer(node.left);
			if(node.right != null) q.offer(node.right);
		}
		
		return root;
	}
	
	private static TreeNode createTreeNode(String[] ary,int i){
		if(i <= ary.length-1 && !ary[i].equals("#")){
			return new TreeNode(Integer.parseInt(ary[i]));
		}else{
			return null;
		}
	}
	

}
