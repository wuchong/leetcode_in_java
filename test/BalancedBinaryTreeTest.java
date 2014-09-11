import static org.junit.Assert.*;

import org.junit.Test;


public class BalancedBinaryTreeTest {

	@Test
	public void test() {
		TreeNode node1 = new TreeNode(1);
		BalancedBinaryTree a = new BalancedBinaryTree();
		assertEquals(true, a.isBalanced(node1));
	}
	
	@Test
	public void test2() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node6 = new TreeNode(6);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node3.left = node6;
		
		
		BalancedBinaryTree a = new BalancedBinaryTree();
		assertEquals(true, a.isBalanced(node1));
	}
	
	@Test
	public void test3() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node4 = new TreeNode(4);

		node1.left = node2;
		node2.left = node4;

		BalancedBinaryTree a = new BalancedBinaryTree();
		assertEquals(false, a.isBalanced(node1));
	}
	
	@Test
	public void test4() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		node1.left = node2;
		node1.right = node3;


		BalancedBinaryTree a = new BalancedBinaryTree();
		assertEquals(true, a.isBalanced(node1));
	}
	
	@Test
	public void testnull() {
		BalancedBinaryTree a = new BalancedBinaryTree();
		assertEquals(false, a.isBalanced(null));
	}

}
