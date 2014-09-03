import static org.junit.Assert.*;

import org.junit.Test;


public class MaximumDepthofBinaryTreeTest {

	@Test
	public void test() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(1);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(1);
		root.left.left.left = new TreeNode(1);
		
		MaximumDepthofBinaryTree a = new MaximumDepthofBinaryTree();
		assertEquals(4, a.maxDepth(root));
	}

	@Test
	public void test2() {
		TreeNode root = new TreeNode(1);
		
		MaximumDepthofBinaryTree a = new MaximumDepthofBinaryTree();
		assertEquals(1, a.maxDepth(root));
	}
	
	
	@Test
	public void test3() {
		TreeNode root = null;
		
		MaximumDepthofBinaryTree a = new MaximumDepthofBinaryTree();
		assertEquals(0, a.maxDepth(root));
	}
}
