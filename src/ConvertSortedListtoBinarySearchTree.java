/**
 * Given a singly linked list where elements are sorted in ascending order, 
 * convert it to a height balanced BST.
 * 
 * answer: 自底向上构建的方法，时间O(N) 空间O(1)
 * 其实这个链表就是一个二叉树的先序遍历结果。
 * 在递归中传的都是同一个链表，只是这个链表的节点不停往前走；而真正决定性变化的是区间；
 * 可以看到，每次递归调用开始时，节点指针都指向区间第一个，结束时节点的指针指向区间末尾的后一个。
 * 每次递归调用时，分成左右两部分，左边构造完时，正好指针指向mid，创建一下root，继续构造右部分子树。
 */

public class ConvertSortedListtoBinarySearchTree {
	private ListNode cur;
    public TreeNode sortedListToBST(ListNode head) {
        int length = 0;
        ListNode node = head;
        while(node != null){
        	length ++ ;
        	node = node.next;
        }
        cur = head;
        return buildTree(0,length-1);
    }
    
    //自底向上构建树
    private TreeNode buildTree(int start,int end){
    	if(start > end) return null;
    	int mid = start + ((end-start)>>1);
    	TreeNode left = buildTree(start,mid-1);
    	TreeNode root = new TreeNode(cur.val);
    	root.left = left;
    	cur = cur.next;
    	root.right = buildTree(mid+1,end);
    	return root;
    }
}
