import static org.junit.Assert.*;

import org.junit.Test;


public class BinaryTreeMaximumPathSumTest {

	@Test
	public void test() {
		String[] ary = {"1","2","3"};
		TreeNode root = CommonUtil.buildTree(ary);
		BinaryTreeMaximumPathSum a = new BinaryTreeMaximumPathSum();
		
		assertEquals(6, a.maxPathSum(root));
	}
	
	@Test
	public void test1() {
		String[] ary = {"1","2"};
		TreeNode root = CommonUtil.buildTree(ary);
		BinaryTreeMaximumPathSum a = new BinaryTreeMaximumPathSum();
		
		assertEquals(3, a.maxPathSum(root));
	}
	
	
	@Test
	public void test2() {
		String[] ary = {"1","2","3","5","-4","6","7","#","#","#","#","-8","#","9","#"};
		TreeNode root = CommonUtil.buildTree(ary);
		BinaryTreeMaximumPathSum a = new BinaryTreeMaximumPathSum();
		
		assertEquals(27, a.maxPathSum(root));
	}
	
	@Test
	public void test3() {
		String[] ary = {"9","6","-3","#","#","-6","2","#","#","2","#","-6","-6","-6"};
		TreeNode root = CommonUtil.buildTree(ary);
		BinaryTreeMaximumPathSum a = new BinaryTreeMaximumPathSum();
		
		assertEquals(16, a.maxPathSum(root));
	}
	
}
