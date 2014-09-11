import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The n-queens puzzle is the problem of placing n queens 
 * on an n×n chessboard such that no two queens attack each other.
 * 
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 * 
 * Each solution contains a distinct board configuration of the n-queens' placement, 
 * where 'Q' and '.' both indicate a queen and an empty space respectively.
 * 
 * For example,
 * There exist two distinct solutions to the 4-queens puzzle:
 * 
 * [
 *  [".Q..",  // Solution 1
 *   "...Q",
 *   "Q...",
 *   "..Q."],
 * 
 *  ["..Q.",  // Solution 2
 *   "Q...",
 *   "...Q",
 *   ".Q.."]
 *  ]
 *
 * answer: dfs，用一维数组int[] pos 保存N个棋子的位置，简化逻辑。时间O(N!) 空间O(N)
 */
public class NQueens {
    public List<String[]> solveNQueens(int n) {
        int[] pos = new int[n];
        List<String[]> res = new ArrayList<>();
        dfs(res,pos,0,n);
        return res;
    }
    
    private void dfs(List<String[]> res, int[] pos, int cur, int n){
    	if(cur == n){
    		printBoard(res,pos);
    	}
    	for(int i=0;i<n;i++){
    		if(isValid(pos,cur,i)){
    			pos[cur] = i;
    			dfs(res,pos,cur+1,n);
    		}
    	}
    }
    
    private boolean isValid(int[] pos, int cur, int col){
    	for(int i=0;i<cur;i++){
    		if(pos[i] == col || Math.abs(cur-i) == Math.abs(pos[i]-col)){
    			return false;
    		}
    	}
    	return true;
    }
    
    private void printBoard(List<String[]> res, int[] pos){
    	String[] board = new String[pos.length];
    	char[] row = new char[pos.length];
    	Arrays.fill(row, '.');
    	for(int i=0;i<pos.length;i++){
    		row[pos[i]] = 'Q';
    		board[i] = new String(row);
    		row[pos[i]] = '.';
    	}
    	res.add(board);
    }
}




















