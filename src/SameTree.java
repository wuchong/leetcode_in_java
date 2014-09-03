/**
 * Given two binary trees, write a function to check if they are equal or not.
 * 
 * Two binary trees are considered equal if they are structurally identical
 *  and the nodes have the same value.
 * 
 * answer: 链表题，两棵树一起DFS
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	//check null
        if(p == null || q == null){
        	if(p == null && q == null){
        		return true;
        	}else{
        		return false;
        	}
        }
        if(p.val != q.val)	
        	return false;
        
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
