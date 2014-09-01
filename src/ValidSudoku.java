/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * 
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 * 
 * Note:
 * A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
 *
 * answer: 细节实现题，尽量代码简洁美观
 */
public class ValidSudoku {

	public boolean isValidSudoku(char[][] board) {
		boolean[] hash;

		for (int i = 0; i < 9; i++) {
			// check row
			hash = new boolean[9];
			for (int j = 0; j < 9; j++) {
				if (!checkValid(board[i][j], hash))
					return false;
			}
			
			// check column
			hash = new boolean[9];
			for (int j = 0; j < 9; j++) {
				if (!checkValid(board[j][i], hash))
					return false;
			}
		}

		for (int i = 0; i < 9; i += 3) {
			for (int j = 0; j < 9; j += 3) {
				hash = new boolean[9];
				//check every block
				for (int m = i; m < i + 3; m++) {
					for (int n = j; n < j + 3; n++) {
						if (!checkValid(board[m][n], hash))
							return false;
					}
				}

			}
		}
		return true;
	}

	//check the char is valid
	private boolean checkValid(char ch, boolean[] hash) {
		if (ch == '.')
			return true;
		if (hash[ch - '1']) {
			return false;
		} else {
			hash[ch - '1'] = true;
		}
		return true;
	}
}
