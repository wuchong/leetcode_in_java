import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 * 
 * For example, given numRows = 5,
 * Return
 * 
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * answer: Ñî»ÔÈý½Ç
 */
public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for (int i = 1; i <= numRows; i++) {
			Integer[] row = new Integer[i];
			row[0] = 1;
			row[i - 1] = 1;
			if (i <= 2) {
				res.add(Arrays.asList(row));
				continue;
			}
			List<Integer> pre = res.get(res.size() - 1);
			for (int j = 1; j < i - 1; j++) {
				row[j] = pre.get(j - 1) + pre.get(j);
			}
			res.add(Arrays.asList(row));
		}
		return res;
	}
}
