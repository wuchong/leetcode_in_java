/**
 * Follow up for problem "Populating Next Right Pointers in Each Node".
 * 
 * What if the given tree could be any binary tree? Would your previous solution still work?
 * 
 * Note:
 * 
 * You may only use constant extra space.
 * 
 * For example,
 * Given the following binary tree,
 *          1
 *        /  \
 *       2    3
 *      / \    \
 *     4   5    7
 * After calling your function, the tree should look like:
 *          1 -> NULL
 *        /  \
 *       2 -> 3 -> NULL
 *      / \    \
 *     4-> 5 -> 7 -> NULL 
 *
 * answer: 与上题"Populating Next Right Pointers in Each Node II"相似。
 * 解法也相似，只不过在连接next指针的时候不能直接将左右节点连接了。
 */
public class PopulatingNextRightPointersinEachNodeII {
    public void connect(TreeLinkNode root) {
        while(root != null){
        	TreeLinkNode first = null;	//下一层第一个非空的节点
        	TreeLinkNode pre = null;	//要连接的前一个节点
        	for(; root != null; root = root.next){
        		if(first == null){
        			first = (root.left != null) ? root.left : root.right;
        		}
        		if(root.left != null){
        			if(pre != null)  pre.next = root.left;
        			pre = root.left;
        		}
        		if(root.right != null){
        			if(pre != null)  pre.next = root.right;
        			pre = root.right;
        		}
        	}
        	root = first;
        }
    }
}
