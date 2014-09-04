/**
 * Given a roman numeral, convert it to an integer.
 *
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * answer: 细节实现题，需要了解 roman numeral 的一些知识
 * wiki: http://zh.wikipedia.org/zh/%E7%BD%97%E9%A9%AC%E6%95%B0%E5%AD%97
 */
public class RomantoInteger {
    public int romanToInt(String s) {
    	if(s.length() == 0)	return 0;
    	int result = map(s.charAt(0));
        for(int i=1;i<s.length();i++){
        	if(map(s.charAt(i)) > map(s.charAt(i-1))){
        		result = result + map(s.charAt(i)) - 2*map(s.charAt(i-1));
        	}else{
        		result += map(s.charAt(i));
        	}
        }
        return result;
    }
    
    private int map(char c){
    	switch (c) {
		case 'I':	return 1;
		case 'V':	return 5;
		case 'X':	return 10;
		case 'L':	return 50;
		case 'C':	return 100;
		case 'D':	return 500;
		case 'M':	return 1000;
		default:	return 0;
		}
    }
}
