import static org.junit.Assert.*;

import org.junit.Test;


public class ConvertSortedArraytoBinarySearchTreeTest {

	@Test
	public void test() {
		int[] num = {1,2,3};
		TreeNode tree1 = new TreeNode(1);
		TreeNode tree2 = new TreeNode(2);
		TreeNode tree3 = new TreeNode(3);
		tree2.left = tree1;
		tree2.right = tree3;
		
		
		ConvertSortedArraytoBinarySearchTree a = new ConvertSortedArraytoBinarySearchTree();
		assertTreeEquals(tree2,a.sortedArrayToBST(num));
	}
	
	@Test
	public void test2() {
		int[] num = {2,3,4,5};
		TreeNode tree2 = new TreeNode(2);
		TreeNode tree3 = new TreeNode(3);
		TreeNode tree4 = new TreeNode(4);
		TreeNode tree5 = new TreeNode(5);
		tree3.left = tree2;
		tree3.right = tree4;
		tree4.right = tree5;
		
		
		ConvertSortedArraytoBinarySearchTree a = new ConvertSortedArraytoBinarySearchTree();
		assertTreeEquals(tree3,a.sortedArrayToBST(num));
	}
	
	@Test
	public void test3() {
		int[] num = {1};
		TreeNode tree1 = new TreeNode(1);

		
		
		ConvertSortedArraytoBinarySearchTree a = new ConvertSortedArraytoBinarySearchTree();
		assertTreeEquals(tree1,a.sortedArrayToBST(num));
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
