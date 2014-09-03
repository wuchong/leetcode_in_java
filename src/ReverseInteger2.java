/**
 * Reverse digits of an integer.
 * 
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * 
 * good questions:
 * If the integer's last digit is 0, what should the output be? 
 * ie, cases such as 10, 100.
 * Did you notice that the reversed integer might overflow?
 * Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. 
 *
 */
public class ReverseInteger2 {
    public int reverse(int x) {
        char[] str = (x+"").toCharArray();
        if(str[0] == '-'){
        	reverse(str,1,str.length-1);
        }else{
        	reverse(str,0,str.length-1);
        }
        return Integer.parseInt(new String(str));
    }
    
    private void reverse(char[] str,int start,int end){
    	if(start >= end) 	return;
    	
    	if(str[start] != str[end]){ 	//swap
        	str[start] ^= str[end];
        	str[end] ^= str[start];
        	str[start] ^= str[end];
    	}
    	reverse(str,start+1,end-1);
    }
}
