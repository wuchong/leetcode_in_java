

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidSudokuTest {

	@Test
	public void test() {
		char[][] board = { ".87654321".toCharArray(),
				"2........".toCharArray(), "3........".toCharArray(),
				"4........".toCharArray(), "5........".toCharArray(),
				"6........".toCharArray(), "7........".toCharArray(),
				"8........".toCharArray(), "9........".toCharArray() };
		ValidSudoku a = new ValidSudoku();
		assertEquals(true, a.isValidSudoku(board));
	}

	@Test
	public void test2() {
		char[][] board = { "53..7....".toCharArray(),
				"6..195...".toCharArray(), ".98....6.".toCharArray(),
				"8...6...3".toCharArray(), "4..8.3..1".toCharArray(),
				"7...2...6".toCharArray(), ".6....28.".toCharArray(),
				"...419..5".toCharArray(), "....8..79".toCharArray() };
		ValidSudoku a = new ValidSudoku();
		assertEquals(true, a.isValidSudoku(board));
	}
	
	@Test
	public void test3() {
		char[][] board = { "53..7....".toCharArray(),
				"6..195...".toCharArray(), ".98....6.".toCharArray(),
				"8...6...3".toCharArray(), "4..8.6..1".toCharArray(),
				"7...2...6".toCharArray(), ".6....28.".toCharArray(),
				"...419..5".toCharArray(), "....8..79".toCharArray() };
		ValidSudoku a = new ValidSudoku();
		assertEquals(false, a.isValidSudoku(board));
	}
	
}
