import static org.junit.Assert.*;

import org.junit.Test;


public class MinimumDepthofBinaryTreeTest {

	@Test
	public void test() {
		String[] ary = {"1","2"};
		TreeNode root = CommonUtil.buildTree(ary);
		MinimumDepthofBinaryTree a = new MinimumDepthofBinaryTree();
		assertEquals(2, a.minDepth(root));
	}
	
	@Test
	public void test2() {
		String[] ary = {"1"};
		TreeNode root = CommonUtil.buildTree(ary);
		MinimumDepthofBinaryTree a = new MinimumDepthofBinaryTree();
		assertEquals(1, a.minDepth(root));
	}
	
	@Test
	public void test3() {
		String[] ary = {"9","6","-3","#","#","-6","2","#","#","2","#","-6","-6","-6"};
		TreeNode root = CommonUtil.buildTree(ary);
		MinimumDepthofBinaryTree a = new MinimumDepthofBinaryTree();
		assertEquals(2, a.minDepth(root));
	}

	@Test
	public void test4() {
		String[] ary = {};
		TreeNode root = CommonUtil.buildTree(ary);
		MinimumDepthofBinaryTree a = new MinimumDepthofBinaryTree();
		assertEquals(0, a.minDepth(root));
	}
}
