/**
 * Given an array of integers, every element appears twice except for one. 
 * Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. 
 * Could you implement it without using extra memory?
 * 
 * answer: 使用异或，只需要一个int
 *
 */
public class SingleNumber {
    public int singleNumber(int[] A) {
        int flag = A[0];
        for(int i=1;i<A.length;i++){
        	flag ^= A[i];
        }
        return flag;
    }
}
