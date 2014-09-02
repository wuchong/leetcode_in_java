/**
 * The gray code is a binary numeral system where two successive values differ in only one bit.
 *
 * Given a non-negative integer n representing the total number of bits in the code, 
 * print the sequence of gray code. A gray code sequence must begin with 0.
 *
 * answer: wiki上提供了两种获得格雷码的方法，一种是公式 a^(a>>1)，另一种是镜射排列，本解法采用前者
 * 上述两种方法的复杂度都为 时间O(2^n) 空间O(1)
 * see more: http://zh.wikipedia.org/wiki/%E6%A0%BC%E9%9B%B7%E7%A0%81
 */

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
	public List<Integer> grayCode(int n) {
		int length = 1 << n;
		List<Integer> result = new ArrayList<Integer>(length);
		for (int i = 0; i < length; i++) {
			int gray = i ^ (i >> 1);
			result.add(gray);
		}
		return result;
	}
}
