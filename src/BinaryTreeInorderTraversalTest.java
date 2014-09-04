import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;


public class BinaryTreeInorderTraversalTest {

	@Test
	public void test() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node4.right = node5;
		
		Integer[] ary = {4,5,2,1,3};
		BinaryTreeInorderTraversal a = new BinaryTreeInorderTraversal();
		assertEquals(new ArrayList<Integer>(Arrays.asList(ary)), a.inorderTraversal(node1));
	}

}
