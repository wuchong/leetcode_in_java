import static org.junit.Assert.*;

import org.junit.Test;


public class SameTreeTest {

	@Test
	public void test() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(1);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(1);
		root.left.left.left = new TreeNode(1);
		
		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(1);
		root2.right = new TreeNode(1);
		root2.left.left = new TreeNode(1);
		root2.left.right = new TreeNode(1);
		root2.left.left.left = new TreeNode(1);
		
		SameTree a = new SameTree();
		assertEquals(true, a.isSameTree(root, root2));
	}
	
	@Test
	public void test2() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.left.left = new TreeNode(6);
		
		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(3);
		root2.left.left = new TreeNode(4);
		root2.left.right = new TreeNode(6);
		root2.left.left.left = new TreeNode(6);
		
		SameTree a = new SameTree();
		assertEquals(false, a.isSameTree(root, root2));
	}
	
	@Test
	public void test3() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.left.left = new TreeNode(6);
		
		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(3);
		root2.left.left = new TreeNode(4);
		root2.left.left.left = new TreeNode(6);
		
		SameTree a = new SameTree();
		assertEquals(false, a.isSameTree(root, root2));
	}
	
	@Test
	public void test4() {
		TreeNode root = null;
		
		TreeNode root2 = null;
		
		SameTree a = new SameTree();
		assertEquals(true, a.isSameTree(root, root2));
	}

}
