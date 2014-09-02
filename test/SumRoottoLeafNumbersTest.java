import static org.junit.Assert.*;

import org.junit.Test;


public class SumRoottoLeafNumbersTest {

	@Test
	public void test() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		SumRoottoLeafNumbers s = new SumRoottoLeafNumbers();
		assertEquals(25 , s.sumNumbers(root));
	}
	
	@Test
	public void test2() {
		TreeNode root = new TreeNode(1);
		
		SumRoottoLeafNumbers s = new SumRoottoLeafNumbers();
		assertEquals(1 , s.sumNumbers(root));
	}
	
	@Test
	public void test3() {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(3);
		
		SumRoottoLeafNumbers s = new SumRoottoLeafNumbers();
		assertEquals(13 , s.sumNumbers(root));
	}

}
