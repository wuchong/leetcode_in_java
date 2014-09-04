/**
 * Given a string, determine if it is a palindrome, 
 * considering only alphanumeric characters and ignoring cases.
 * 
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * 
 * Note:
 * Have you consider that the string might be empty? 
 * This is a good question to ask during an interview.
 * 
 * For the purpose of this problem, we define empty string as valid palindrome.
 * 
 * answer：两个指针往中间走，时间O(N) 空间O(1)
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left < right){
        	char lc = validChar(s.charAt(left));
        	while(lc == 0 && left < right)	lc = validChar(s.charAt(++left));
        	char rc = validChar(s.charAt(right));
        	while(rc == 0 && left < right)	rc = validChar(s.charAt(--right));
        	if(lc == rc){
        		left ++;right--;
        	}else{
        		return false;
        	}
        }
        return true;
    }
    
    private char validChar(char c){
    	if(c >= '0' && c <= '9'){		//numeric
    		return c;
    	}else if(c >= 'a' && c <= 'z'){	//lower alphan 
    		return c;
    	}else if(c >= 'A' && c <= 'Z'){	//upper alpha
    		return Character.toLowerCase(c);
    	}
    	return 0;	//not valid
    }
}
