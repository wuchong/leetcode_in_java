import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class BinaryTreeLevelOrderTraversalIITest {

	@Test
	public void test() {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		
		node1.left = node2;
		node1.right = node3;
		node3.left = node4;
		node3.right = node5;
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(new Integer[]{4,5}));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(new Integer[]{2,3}));
		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(new Integer[]{1}));
		ArrayList<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(list1);
		expected.add(list2);
		expected.add(list3);


		
		BinaryTreeLevelOrderTraversalII a = new BinaryTreeLevelOrderTraversalII();
		assertEquals(expected, a.levelOrderBottom(node1));
	}
	
	@Test
	public void test2() {
		TreeNode node1 = null;
		
		ArrayList<List<Integer>> expected = new ArrayList<List<Integer>>();


		
		BinaryTreeLevelOrderTraversalII a = new BinaryTreeLevelOrderTraversalII();
		assertEquals(expected, a.levelOrderBottom(node1));
	}

}
