/**
 * Given a sorted array and a target value, 
 * return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 *
 * answer: 二分查找，如果找不到返回left即可，left总是要插入的位置
 */
public class SearchInsertPosition {
    public int searchInsert(int[] A, int target) {
        int left = 0;
        int right = A.length - 1;
        int mid;
        while(left <= right){
        	mid = left + ((right-left)>>1);
        	if(A[mid] == target){
        		return mid;
        	}else if(A[mid] < target){
        		left = mid+1;
        	}else{
        		right = mid-1;
        	}
        }
        return left;
    }
}
