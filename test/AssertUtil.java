import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
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
	
	//二维list一般性检验
	public static void assertListCommonEquals(List<List<String>> expected,
			List<List<String>> result) {
		String error = errorString(Arrays.toString(expected.toArray()),
				Arrays.toString(expected.toArray()));
		assertFalse(error,expected.size() != result.size());
		for(List<String> list : expected){
			assertFalse(error, !result.contains(list));
		}
	}
	
	//检验随机链表是否相同
	public static void assertRandomListEquals(RandomListNode expected,RandomListNode result){
		if(expected == null || result == null){
			if(expected == null || result == null){
				if(expected != null){
					assertFalse(errorString("null",result.label),true);
				}else if(result != null){
					assertFalse(errorString(expected.label,"null"),true);
				}else{
					return;
				}
			}
		}
		RandomListNode node1 = expected;
		RandomListNode node2 = result;
		while(node1 != null){
			if(node1.label != node2.label){
				assertFalse("label not equal"+errorString(expected.label,result.label),true);
			}
			if(node1.random == null || node2.random == null){
				if(node1.random != node2.random){
					assertFalse("random not equal null",true);
				}
			}else if(node1.random.label != node2.random.label){
				assertFalse("random "+errorString(node1.random.label,node2.random.label),true);
			}
			node1 = node1.next;
			node2 = node2.next;
		}
		assertFalse(node2 != null);
	}
	
	
	public static void assertLinkedListEquals(ListNode expected,ListNode result){
		ListNode node1 = expected;
		ListNode node2 = result;
		String str1 = CommonUtil.linkedlistToString(node1);
		String str2 = CommonUtil.linkedlistToString(node2);
		if((node1 == null || node2 == null) && (node1 != node2)){
			assertFalse(errorString(str1,str2),true);
		}
		while(node1 != null){
			assertFalse("val not equal"+errorString(str1,str2),node1.val != node2.val);
			node1 = node1.next;
			node2 = node2.next;
		}
		assertFalse("val not equal"+errorString(str1,str2),node2 != null);
	}
	private static String errorString(Object expected,Object result){
		return "expected:<"+expected+"> but was:<"+result+">";
	}
}
