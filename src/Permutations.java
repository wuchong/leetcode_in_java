import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of numbers, return all possible permutations.
 * 
 * For example,
 * [1,2,3] have the following permutations:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 *
 * answer: 固定前一个，递归交换后面的元素
 */
public class Permutations {
    public List<List<Integer>> permute(int[] num) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	permute(res,num,0);
    	return res;
    }
    
    private void permute(List<List<Integer>> res,int[] num,int k){
    	if(k == num.length){
    		List<Integer> list = new ArrayList<Integer>();
    		for(int i : num) list.add(i);
    		res.add(list);
    		return;
    	}
    	for(int i=k;i<num.length;i++){
    		swap(num,k,i);
    		permute(res,num,k+1);
    		swap(num,k,i);
    	}
    }
    
	private void swap(int A[], int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
