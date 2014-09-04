/**
 * Given an array of integers, every element appears 
 * three times except for one. Find that single one.
 * 
 * Note:
 * Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 *
 * answer：用长为32的int数组在存放在每一位上1出现的次数，如果为3的倍数，
 * 则要找的数在该位上不为1,   时间O(N) 空间O(1)
 */
public class SingleNumberII2 {
	public int singleNumber(int[] A) {
		final int BITS = 32;
		int[] times = new int[BITS];
		for (int i = 0; i < A.length; i++) {
			for (int k = 0; k < BITS; k++) {
				times[k] += (A[i] >> k) & 1;
				times[k] %= 3;
			}
		}
		int result = 0;
		for (int k = 0; k < BITS; k++) {
			result |= (times[k] << k);
		}
		return result;
	}
}
