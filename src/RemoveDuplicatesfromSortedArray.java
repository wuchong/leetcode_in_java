/**
 * Given a sorted array, remove the duplicates in place such 
 * that each element appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do 
 * this in place with constant memory.
 * 
 * For example,
 * Given input array A = [1,1,2],
 * 
 * Your function should return length = 2, and A is now [1,2].
 *
 * answer: ø’º‰O(1)  ±º‰O(N)
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] A) {
    	if(A == null || A.length <= 0)	return 0;
    	int num = A[0];
    	int count = 1;
        for(int i=1;i<A.length;i++){
        	if(A[i] != num){
        		num = A[i];
        		A[count++] = num;
        	}
        }
        return count;
    }
}
