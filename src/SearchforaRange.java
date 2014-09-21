/**
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 * 
 * answer: 二分查找的灵活运用
 *
 */
public class SearchforaRange {
    public int[] searchRange(int[] A, int target) {
        int first = binarySearchForFirst(A,target);
        int last = binarySearchForLast(A,target);
        return new int[]{first,last};
    }
    
    private int binarySearchForLast(int[] A,int target){
    	int left = 0;
    	int right = A.length-1;
    	int mid;
    	while(left < right){
    		mid = left + ((right-left+1)>>1);   //注意要加1
    		if(A[mid] > target){
    			right = mid - 1;
    		}else{	//A[mid] <= target 此处不能拆成两个条件
    			left = mid; 
    		}
    	}
    	
    	if(A[left] == target)
    		return left;
    	else return -1;
    }
    
    private int binarySearchForFirst(int[] A,int target){
    	int left = 0;
    	int right = A.length-1;
    	int mid;
    	while(left < right){
    		mid = left + ((right-left)>>1);
    		if(A[mid] < target){
    			left = mid + 1;
    		}else{	//A[mid] >= target
    			right = mid; 
    		}
    	}
    	
    	if(A[left] == target)
    		return left;
    	else return -1;
    }
}
