/**
 * Reverse digits of an integer.
 * 
 * Example1: x = 123, return 321 Example2: x = -123, return -321
 * 
 * good questions: If the integer's last digit is 0, what should the output be?
 * ie, cases such as 10, 100. Did you notice that the reversed integer might
 * overflow? Assume the input is a 32-bit integer, then the reverse of
 * 1000000003 overflows.
 * 
 */
public class ReverseInteger {
	public int reverse(int x) {
		int r = 0;
		for (; x != 0; x /= 10) {
			r = r * 10 + x % 10;
		}
		return r;
	}
}
