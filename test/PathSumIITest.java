import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class PathSumIITest {

	@Test
	public void test() {
		String[] ary = {"5","4","8","11","#","13","4","7","2","#","#","5","1"};
		Integer[][] list = {{5,4,11,2},{5,8,4,5}};
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for(int i=0;i<list.length;i++){
			res.add(Arrays.asList(list[i]));
		}
		TreeNode root = CommonUtil.buildTree(ary);
		PathSumII a = new PathSumII();
		assertEquals(res , a.pathSum(root, 22));
	}
	
	

	@Test
	public void test4() {
		String[] ary = {};
		Integer[][] list = {};
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for(int i=0;i<list.length;i++){
			res.add(Arrays.asList(list[i]));
		}
		TreeNode root = CommonUtil.buildTree(ary);
		PathSumII a = new PathSumII();
		assertEquals(res , a.pathSum(root, 9));
	}
	
	@Test
	public void test5() {
		String[] ary = {"1","2","#"};
		Integer[][] list = {{1,2}};
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for(int i=0;i<list.length;i++){
			res.add(Arrays.asList(list[i]));
		}
		TreeNode root = CommonUtil.buildTree(ary);
		PathSumII a = new PathSumII();
		assertEquals(res , a.pathSum(root,3));
	}
	
	@Test
	public void test6() {
		String[] ary = {"1","2","#"};
		Integer[][] list = {};
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for(int i=0;i<list.length;i++){
			res.add(Arrays.asList(list[i]));
		}
		TreeNode root = CommonUtil.buildTree(ary);
		PathSumII a = new PathSumII();
		assertEquals(res , a.pathSum(root,1));
	}

}
