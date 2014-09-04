import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 *  determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" 
 * are all valid but "(]" and "([)]" are not.
 *
 * answer: ջ
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char c ;
        for(int i=0;i<s.length();i++){
        	c = s.charAt(i);
        	if(c == '(' || c == '[' || c == '{'){
        		stack.push(c);
        	}else{
        		if(stack.isEmpty() || stack.peek() != correspond(c)){
        			return false;
        		}else{
        			stack.pop();
        		}
        	}
        }
        if(stack.isEmpty())
        	return true;
        else
        	return false;
    }
    
    private char correspond(char c){
    	switch(c){
    	case '}':	return '{';
    	case ']':	return '[';
    	case ')':	return '(';
    	default:	return 0;
    	}
    }
}
