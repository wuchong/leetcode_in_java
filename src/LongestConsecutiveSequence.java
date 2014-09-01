/**
 * Given an unsorted array of integers, 
 * find the length of the longest consecutive elements sequence.
 *
 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 *
 * Your algorithm should run in O(n) complexity.
 * 
 * answer£∫ π”√hash
 * 
 */

import java.util.HashSet;

public class LongestConsecutiveSequence {
	public int longestConsecutive(int[] num) {
		HashSet<Integer> set = new HashSet<Integer>();
		int max = 1;
		for (int n : num) {
			set.add(n);
		}
		for (int n : num) {
			if (set.contains(n)) {
				set.remove(n);
				max = Math.max(max,getCounts(set, n + 1, true)
								+ getCounts(set, n - 1, false) + 1);
			}
		}
		return max;
	}

	private int getCounts(HashSet<Integer> set, int num, boolean asc) {
		int count = 0;
		while (set.contains(num)) {
			count++;
			set.remove(num);
			if (asc) {
				num++;
			} else {
				num--;
			}
		}
		return count;
	}
}
