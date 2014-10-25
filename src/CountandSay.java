/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * 
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 * 
 * Note: The sequence of integers will be represented as a string.
 *
 * answer: ×Ö·û´®Ìâ
 */
public class CountandSay {
    public String countAndSay(int n) {
    	if(n <= 0)	return null;
        String say = "1";
        while(--n > 0){
        	say = readOff(say);
        }
        return say;
    }
    
    private String readOff(String str){
    	StringBuilder sb = new StringBuilder();
    	int count = 1;
    	char ch = str.charAt(0);
    	for(int i=1;i<str.length();i++){
    		if(ch == str.charAt(i)){
    			count++;
    		}else{
    			sb.append(count).append(ch);
    			count = 1;
    			ch = str.charAt(i);
    		}
    	}
    	sb.append(count).append(ch);
    	return sb.toString();
    }
}
