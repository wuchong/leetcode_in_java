/**
 * Follow up for "Search in Rotated Sorted Array":
 * What if duplicates are allowed?
 * 
 * Would this affect the run-time complexity? How and why?
 * 
 * Write a function to determine if a given target is in the array.
 *
 * answer:  
 * 上一题中如果A[m]>=A[l], 那么[l,m] 为递增序列的假设就不能成立了，比
 * 如[1,3,1,1,1]。
 * 如果A[m]>=A[l] 不能确定递增，那就把它拆分成两个条件：
 * - 若A[m]>A[l]，则区间[l,m] 一定递增
 * - 若A[m]==A[l] 确定不了，那就l++，往下看一步即可。
 */
public class SearchinRotatedSortedArrayII {
    public boolean search(int[] A, int target) {
        int left = 0;
        int right = A.length - 1;
        int mid;
        while(left <= right){
        	mid = left + ((right-left)>>1);
        	if(A[mid] == target){
        		return true;
        	}
        	if(A[mid] > A[left]){		//[left,mid] 为递增区间
        		if(A[left] <= target && target < A[mid]){
        			right = mid - 1;
        		}else{
        			left = mid + 1;
        		}
        	}else if(A[mid] < A[left]){		//[mid,right] 为递增区间
        		if(A[mid] < target && target <= A[right]){
        			left = mid + 1;
        		}else{
        			right = mid - 1;
        		}
        	}else{		// A[mid] == A[left] 
        		left ++;	//跳过重复元素
        	}
        }
        return false;
    }
}
