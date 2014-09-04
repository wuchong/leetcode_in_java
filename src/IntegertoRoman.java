/**
 * Given an integer, convert it to a roman numeral.
 *
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * answer: 细节实现题，需要了解 roman numeral 的一些知识
 * wiki: http://zh.wikipedia.org/zh/%E7%BD%97%E9%A9%AC%E6%95%B0%E5%AD%97
 */
public class IntegertoRoman {
	public String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; num != 0; i++) {
			int k = num % 10;
			sb.insert(0, map(k, i));
			num /= 10;
		}
		return sb.toString();
	}

	// place：位（个位、百位） k：某位上的数
	private String map(int k, int place) {
		String[] roman = { "I", "V", "X", "L", "C", "D", "M" };
		String re = "";
		if (k == 1) {
			re = roman[(place - 1) * 2];
		} else if (k == 5) {
			re = roman[place * 2 - 1];
		} else if (k == 9) {
			re = roman[(place - 1) * 2] + roman[place * 2];
		} else if (k == 4) {
			re = roman[(place - 1) * 2] + roman[place * 2 - 1];
		} else if (k < 4 && k > 0) {
			re = replication(roman[(place - 1) * 2], k);
		} else if (k > 5 && k < 9) {
			re = roman[place * 2 - 1] + replication(roman[(place - 1) * 2], k-5);
		}
		return re;
	}

	private String replication(String c, int times) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < times; i++) {
			sb.append(c);
		}
		return sb.toString();
	}
}
