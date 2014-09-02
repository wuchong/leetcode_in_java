/**
 * Given an unsorted integer array, find the first missing positive integer.
 * Your algorithm should run in O(n) time and uses constant space.
 *
 * answer: 交换数组元素，使得数组中第i位存放数值(i+1)。时间O(N)，空间O(1)
 */

public class FirstMissingPositive {
	public int firstMissingPositive(int[] A) {
		for(int i=0;i<A.length;i++){
			while(A[i] != i+1){
				if(A[i] <= 0 || A[i] >= A.length || A[A[i]-1] == A[i]){
					break;
				}
				swap(A,i,A[i]-1);
			}
		}
		int i;
		for(i=0;i<A.length;i++){
			if(A[i] != i+1){
				break;
			}
		}
		return i+1;
	}
	
	private void swap(int[] A,int x,int y){
		if(A[x] != A[y]){
			A[x] ^= A[y];
			A[y] ^= A[x];
			A[x] ^= A[y];
		}
	}
}
