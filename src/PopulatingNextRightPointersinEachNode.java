/**
 * Given a binary tree
 * 
 *     struct TreeLinkNode {
 *       TreeLinkNode *left;
 *       TreeLinkNode *right;
 *       TreeLinkNode *next;
 *     }
 *     
 * Populate each next pointer to point to its next right node. 
 * If there is no next right node, the next pointer should be set to NULL.
 * 
 * Initially, all next pointers are set to NULL.
 * 
 * Note:
 * 
 * You may only use constant extra space.
 * You may assume that it is a perfect binary tree 
 * (ie, all leaves are at the same level, and every parent has two children).
 * 
 * 
 * answer: 因为要常数空间，所以不能使用队列广搜。
 * 因为在遍历下一层的时候，上一层已经用next串好了，所以使用两个变量遍历即可。
 */
public class PopulatingNextRightPointersinEachNode {
	public void connect(TreeLinkNode root) {
		while (root != null) {
			TreeLinkNode first = root;	//上一层的第一个节点
			TreeLinkNode pre = null;	//左子树前的节点
			for (; root != null; root = root.next) {
				if (pre != null) {
					pre.next = root.left;
				}
				if(root.left != null){
					root.left.next = root.right;
				}
				pre = root.right;
			}
			root = first.left;
		}
	}
}
