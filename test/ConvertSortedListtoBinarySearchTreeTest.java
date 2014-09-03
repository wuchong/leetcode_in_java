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
		AssertUtil.assertTreeEquals(tree2,a.sortedListToBST(node1));
	}
	

}
