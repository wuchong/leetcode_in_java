/**
 * Given an array of integers, every element appears 
 * three times except for one. Find that single one.
 * 
 * Note:
 * Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 *
 * answer：使用位运算，时间O(N) 空间O(1)
 * 用两个数one和two，当一个数第一次出现会先保存在one中；第二次出现在one中清除，
 * 保存在two中；第三次出现会将two中清除。最后输出one即可。 "用二进制模拟三进制"
 */
public class SingleNumberII {
    public int singleNumber(int[] A) {
    	int one = 0;
    	int two = 0;
        for(int i=0;i<A.length;i++){
        	one = (one ^ A[i]) & ~two;
        	two = (two ^ A[i]) & ~one;
        }
        return one;
    }
}
