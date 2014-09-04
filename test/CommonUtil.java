import java.util.Arrays;
import java.util.List;


public class CommonUtil {

	public static String listToString(List<String> list){
		return Arrays.toString(list.toArray());
	}

	
	public static String arrayToString(char[] ary){
		StringBuilder sb = new StringBuilder();
		for(char s : ary){
			sb.append(s);
		}
		return sb.toString();
	}
	
	public static String arrayToString(char[][] ary){
		StringBuilder sb = new StringBuilder("[");
    	int m = ary.length;
    	int n = ary[0].length;
    	for(int i=0;i<m;i++){
    		sb.append(arrayToString(ary[i]));
    		sb.append(",");
    	}
    	sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		return sb.toString();
	}
	


}
