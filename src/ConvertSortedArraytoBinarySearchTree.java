/**
 * Given an array where elements are sorted in ascending order, 
 * convert it to a height balanced BST.
 * 
 * answer:
 */
public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] num) {
        return buildTree(num,0,num.length-1);
    }
    
    private TreeNode buildTree(int[] num,int start,int end){
    	if(start > end) return null;
    	int mid = start + ((end-start)>>1);
    	TreeNode root = new TreeNode(num[mid]);
    	root.left = buildTree(num,start,mid-1);
    	root.right = buildTree(num,mid+1,end);
    	return root;
    }
}
