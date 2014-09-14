/**
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * 
 * The digits are stored such that the most significant digit is at the head of the list.
 *
 * answer: 大数相加，细节实现题
 */
public class PlusOne {
	public int[] plusOne(int[] digits) {
		int carry = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			int temp = digits[i] + carry;
			digits[i] = temp % 10;
			carry = temp / 10;
			if (carry == 0)
				break;
		}
		if (carry > 0) {
			int[] res = new int[digits.length + 1];
			res[0] = carry;
			for (int i = 0; i < digits.length; i++) {
				res[i + 1] = digits[i];
			}
			return res;
		} else {
			return digits;
		}
	}
}
