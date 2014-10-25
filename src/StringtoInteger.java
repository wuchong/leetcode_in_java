/**
 * Implement atoi to convert a string to an integer.
 * 
 * Hint: Carefully consider all possible input cases. If you want a challenge, 
 * please do not see below and ask yourself what are the possible input cases.
 * 
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). 
 * You are responsible to gather all the input requirements up front.
 *
 * answer:细节实现题
 */
public class StringtoInteger {
    public int atoi(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}
		final int MAX_DIV = Integer.MAX_VALUE / 10;
		final int MIN_DIV = -(Integer.MIN_VALUE / 10);
		final int MAX_M = Integer.MAX_VALUE % 10;
		final int MIN_M = - (Integer.MIN_VALUE % 10);
		int result = 0;
		int i = 0, len = str.length();
		int sign = 1;
		int digit = str.charAt(0);
		
		while(digit == ' ')
		{
			if (i+1 == len) {
				return 0;
			}	
			digit = str.charAt(++i);
		}
		
		if (digit == '-' || digit == '+') {
			if (digit == '-') {
				sign = -1;
			}
			if (i+1 == len) {
				return 0;
			}
			i++;
		}

		while (i < len) {
			digit = str.charAt(i++) - '0';
			if (digit >= 0 && digit <= 9) {
				if (sign > 0
						&& (result > MAX_DIV || (result == MAX_DIV && digit > MAX_M))) { // 正数溢出
					return Integer.MAX_VALUE;
				} else if (sign < 0
						&& (result > MIN_DIV || (result == MIN_DIV && digit > MIN_M))) { // 负数溢出
					return Integer.MIN_VALUE;
				}
				result = result * 10 + digit;
			} else {
				break;
			}
		}

		return sign > 0 ? result : -result;
    }
}
