import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;


public class AssertUtil {
	//list一般性检验，不要求顺序一致
	public static void assertArrayCommonEquals(List<String> result, List<String> anagrams) {
		// TODO Auto-generated method stub
		String ret = CommonUtil.listToString(result);
		String ana = CommonUtil.listToString(anagrams);
		assertFalse(errorString(ret,ana),result.size() != anagrams.size());
		
		for(String s : result){
			assertFalse(errorString(ret,ana),!anagrams.contains(s));
		}
		assertTrue(true);
		
	}
	
	//树检验
	public static void assertTreeEquals(TreeNode expected, TreeNode result) {
		if(expected == null || result == null){
			if(expected != null){
				assertFalse(errorString("null",result.val),true);
			}else if(result != null){
				assertFalse(errorString(expected.val,"null"),true);
			}else{
				return;
			}
		}
		assertFalse(errorString(expected.val,result.val),expected.val != result.val);
		assertTreeEquals(expected.left,result.left);
		assertTreeEquals(expected.right,result.right);
	}
	
	//二维数组检验
	public static void assert2DArrayEquals(char[][] expecteds, char[][] board) {
    	int m = board.length;
    	if(m == 0)	return;
    	int n = board[0].length;
    	if(n == 0) 	return;
    	for(int i=0;i<m;i++){
    		for(int j=0;j<n;j++){
    			if(board[i][j] != expecteds[i][j]){
    				String expected = CommonUtil.arrayToString(expecteds);
    				String result = CommonUtil.arrayToString(board);
    				assertFalse(errorString(expected, result),true);
    			}
    		}
    	}
		
	}
	
	private static String errorString(Object expected,Object result){
		return "expected:<"+expected+"> but was:<"+result+">";
	}
}
