import static org.junit.Assert.*;

import org.junit.Test;


public class ConvertSortedListtoBinarySearchTreeTest {

	@Test
	public void test() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		
		TreeNode tree1 = new TreeNode(1);
		TreeNode tree2 = new TreeNode(2);
		TreeNode tree3 = new TreeNode(3);
		tree2.left = tree1;
		tree2.right = tree3;
		
		
		ConvertSortedListtoBinarySearchTree a = new ConvertSortedListtoBinarySearchTree();
		assertTreeEquals(tree2,a.sortedListToBST(node1));
	}
	

	private void assertTreeEquals(TreeNode expected, TreeNode result) {
		if(expected == null || result == null){
			if(expected != null){
				assertFalse(errorString("null",result.val),true);
			}else if(result != null){
				assertFalse(errorString(expected.val,"null"),true);
			}else{
				return;
			}
		}
		assertFalse(errorString(expected.val,result.val),expected.val != result.val);
		assertTreeEquals(expected.left,result.left);
		assertTreeEquals(expected.right,result.right);
	}
	
	private String errorString(Object expected,Object result){
		return "expected:<"+expected+"> but was:<"+result+">";
	}

}
