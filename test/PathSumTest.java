import static org.junit.Assert.*;

import org.junit.Test;


public class PathSumTest {

	@Test
	public void test() {
		String[] ary = {"5","4","8","11","#","13","4","7","2","#","#","#","1"};
		TreeNode root = CommonUtil.buildTree(ary);
		PathSum a = new PathSum();
		assertEquals(true, a.hasPathSum(root, 22));
	}
	
	@Test
	public void test2() {
		String[] ary = {"5","4","8","11","#","13","4","7","2","#","#","#","1"};
		TreeNode root = CommonUtil.buildTree(ary);
		PathSum a = new PathSum();
		assertEquals(true, a.hasPathSum(root, 26));
	}
	
	@Test
	public void test3() {
		String[] ary = {"5","4","8","11","#","13","4","7","2","#","#","#","1"};
		TreeNode root = CommonUtil.buildTree(ary);
		PathSum a = new PathSum();
		assertEquals(false, a.hasPathSum(root, 100));
	}

	@Test
	public void test4() {
		String[] ary = {};
		TreeNode root = CommonUtil.buildTree(ary);
		PathSum a = new PathSum();
		assertEquals(false, a.hasPathSum(root, 0));
	}
	
	@Test
	public void test5() {
		String[] ary = {"1","2","#"};
		TreeNode root = CommonUtil.buildTree(ary);
		PathSum a = new PathSum();
		assertEquals(false, a.hasPathSum(root, 1));
	}
}
