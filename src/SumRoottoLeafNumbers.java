/**
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

 * An example is the root-to-leaf path 1->2->3 which represents the number 123.

 * Find the total sum of all root-to-leaf numbers.
 * 
 * answer: 基本链表题
 *
 */


public class SumRoottoLeafNumbers {
	private int sum;

	public int sumNumbers(TreeNode root) {
		recursivePath(root, 0);
		return sum;
	}

	private void recursivePath(TreeNode root, int num) {
		if (root == null)
			return;
		num = num * 10 + root.val;
		if (root.left != null) {
			recursivePath(root.left, num);
		}
		if (root.right != null) {
			recursivePath(root.right, num);
		}

		if (root.left == null && root.right == null) {
			sum += num;
		}
	}
}
