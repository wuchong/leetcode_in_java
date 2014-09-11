import static org.junit.Assert.*;

import org.junit.Test;


public class NQueensTest {

	@Test
	public void test() {
		int n = 4;
		NQueens a = new NQueens();
		a.solveNQueens(n);		//print boards
	}	

}
