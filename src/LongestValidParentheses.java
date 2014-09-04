import java.util.Stack;

/**
 * Given a string containing just the characters '(' and ')', 
 * find the length of the longest valid (well-formed) parentheses substring.
 * 
 * For "(()", the longest valid parentheses substring is "()", 
 * which has length = 2.
 * 
 * Another example is ")()())", where the longest valid 
 * parentheses substring is "()()", which has length = 4.
 *
 * answer: 使用栈，栈中存的是下标，时间O(N) 空间O(N)
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
    	Stack<Integer> stack = new Stack<>();
    	int max = 0;
        int last = -1;	//保存最后一个不匹配的 ')' 的下标
        char c;
        for(int i=0;i<s.length();i++){
        	c = s.charAt(i);
        	if(c == '('){
        		stack.push(i);
        	}else if(c == ')'){
        		if(stack.isEmpty()){
        			last = i;	//更新最后一个不匹配的 ')'
        		}else{
        			stack.pop();
        			if(stack.isEmpty()){
        				max = Math.max(max, i - last);
        			}else{
        				max = Math.max(max, i - stack.peek());
        			}
        		}
        	}
        }
        return max;
    }
}
