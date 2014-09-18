/**
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 * 
 * For example,
 * Given sorted array A = [1,1,1,2,2,3],
 * 
 * Your function should return length = 5, and A is now [1,1,2,2,3].
 *
 * answer: 用个count记录出现次数即可
 */
public class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] A) {
    	if(A == null || A.length == 0) return 0;
        int index = 1;
        int count = 1;
        for(int i=1;i<A.length;i++){
        	if(A[i] == A[index-1] && count == 1){
        		A[index++] = A[i];
        		count = 0;
        	}else if(A[i] != A[index-1]){
        		A[index++] = A[i];
        		count = 1;
        	}
        }
        return index;
    }
}
