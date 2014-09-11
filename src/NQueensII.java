import java.util.ArrayList;
import java.util.List;

/**
 * Follow up for N-Queens problem.
 * 
 * Now, instead outputting board configurations, 
 * return the total number of distinct solutions.
 *
 * answer: 与上题相同的思路，只需要对结果个数+1即可
 */
public class NQueensII {
	int count = 0;

	public int totalNQueens(int n) {
		if (n <= 0)
			return count;
		int[] pos = new int[n];
		List<String[]> res = new ArrayList<>();
		dfs(res, pos, 0, n);
		return count;
	}

	private void dfs(List<String[]> res, int[] pos, int cur, int n) {
		if (cur == n) {
			count++;
			return;
		}
		for (int i = 0; i < n; i++) {
			if (isValid(pos, cur, i)) {
				pos[cur] = i;
				dfs(res, pos, cur + 1, n);
			}
		}
	}

	private boolean isValid(int[] pos, int cur, int col) {
		for (int i = 0; i < cur; i++) {
			if (pos[i] == col || Math.abs(cur - i) == Math.abs(pos[i] - col)) {
				return false;
			}
		}
		return true;
	}
}
