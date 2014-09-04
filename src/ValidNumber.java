/**
 * Validate if a given string is numeric.
 * 
 * Some examples:
 * 		"0" => true
 * 		" 0.1 " => true
 * 		"abc" => false
 * 		"1 a" => false
 * 		"2e10" => true
 * 
 * Note: It is intended for the problem statement to be ambiguous. 
 * You should gather all requirements up front before implementing one.
 *
 * answer : 通过e分成两部分，左边可以是一个数值，右边必须是整数
 */
public class ValidNumber {
	public boolean isNumber(String s) {
	    s = s.trim();
	    if (s.length() < 1 || s.charAt(s.length()-1) == 'e') return false;
	    String[] sp = s.split("e");
	    if (sp.length > 2 || sp.length < 1) return false;
	    if (!validNumeric(sp[0], false)) return false;
	    if (sp.length == 1 || (sp.length == 2 && validNumeric(sp[1], true))) return true;
	    return false;
	}
	
	private boolean validNumeric(String s,boolean integer){
		int index = 0;
		if (s.length() < 1 || s.equals("."))
			return false;
		if (s.charAt(0) == '+' || s.charAt(0) == '-')
			index++;
		if (index == s.length())
			return false;
		char c ;
		boolean hasPoint = false;	//has '.'
		boolean hasNum = false;		//has numeric
		for(;index < s.length();index++){
			c = s.charAt(index);
			if(c == '.'){
				if(!hasPoint && !integer) hasPoint = true;
				else return false;
				continue;
			}
			if(c < '0' || c > '9') return false;
			hasNum = true;
		}
		return hasNum;
	}
	
}
