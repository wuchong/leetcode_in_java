import static org.junit.Assert.*;

import org.junit.Test;


public class SetMatrixZeroesTest {

	@Test
	public void test() {
		int[][] matrix = {{1,0,1,1},{1,0,1,0},{1,1,0,1},{1,1,1,1}};
		int[][] expected = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{1,0,0,0}};
		SetMatrixZeroes a = new SetMatrixZeroes();
		a.setZeroes(matrix);
		assertArrayEquals(expected, matrix);
	}

	@Test
	public void test2() {
		int[][] matrix = {{1}};
		int[][] expected = {{1}};
		SetMatrixZeroes a = new SetMatrixZeroes();
		a.setZeroes(matrix);
		assertArrayEquals(expected, matrix);
	}

	
	
}
