import static org.junit.Assert.*;

import org.junit.Test;


public class SymmetricTreeTest {

	@Test
	public void test() {
		String[] ary = {"1","2","2","3","4","4","3"};
		TreeNode root = CommonUtil.buildTree(ary);
		SymmetricTree a = new SymmetricTree();
		assertEquals(true, a.isSymmetric(root));
	}
	
	@Test
	public void test2() {
		String[] ary = {"1","2","2","#","3","#","3"};
		TreeNode root = CommonUtil.buildTree(ary);
		SymmetricTree a = new SymmetricTree();
		assertEquals(false, a.isSymmetric(root));
	}
	
	@Test
	public void test3() {
		String[] ary = {"1"};
		TreeNode root = CommonUtil.buildTree(ary);
		SymmetricTree a = new SymmetricTree();
		assertEquals(true, a.isSymmetric(root));
	}
	
	@Test
	public void test4() {
		String[] ary = {};
		TreeNode root = CommonUtil.buildTree(ary);
		SymmetricTree a = new SymmetricTree();
		assertEquals(true, a.isSymmetric(root));
	}
	
	@Test
	public void test5() {
		String[] ary = {"4","-57","-57","#","67","67","#","#","-97","-97"};
		TreeNode root = CommonUtil.buildTree(ary);
		SymmetricTree a = new SymmetricTree();
		assertEquals(true, a.isSymmetric(root));
	}
}
