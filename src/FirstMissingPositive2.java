/**
 * Given an unsorted integer array, find the first missing positive integer.
 * Your algorithm should run in O(n) time and uses constant space.
 *
 * answer: 使用hash，时间O(N)，空间也是O(N)  很奇怪没有内存溢出
 */

import java.util.HashSet;

public class FirstMissingPositive2 {
    public int firstMissingPositive(int[] A) {
        HashSet<Integer> set = new HashSet<Integer>(A.length);
        for(int i : A){
        	if(i > 0) set.add(i);	
        }
        int index = 1;
        while(set.contains(index)){
        	index ++ ;
        }
        return index;
    }
}
