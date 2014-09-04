import static org.junit.Assert.*;

import org.junit.Test;


public class CopyListwithRandomPointerTest {

	@Test
	public void test() {
		RandomListNode node1 = new RandomListNode(1);
		RandomListNode node2 = new RandomListNode(2);
		RandomListNode node3 = new RandomListNode(3);
		RandomListNode node4 = new RandomListNode(4);
		RandomListNode node5 = new RandomListNode(5);
		RandomListNode node6 = new RandomListNode(6);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node1.random = node3;
		node2.random = node6;
		node5.random = node5;
		node6.random = node4;
		
		CopyListwithRandomPointer a = new CopyListwithRandomPointer();
		
		AssertUtil.assertRandomListEquals(node1, a.copyRandomList(node1));
	}
	
	@Test
	public void test2() {
		RandomListNode node1 = new RandomListNode(1);
		
		CopyListwithRandomPointer a = new CopyListwithRandomPointer();
		
		AssertUtil.assertRandomListEquals(node1, a.copyRandomList(node1));
	}
	
	@Test
	public void test3() {
		RandomListNode node1 = new RandomListNode(1);
		RandomListNode node2 = new RandomListNode(2);

		node1.next = node2;

		node1.random = node2;
		node2.random = node1;

		
		CopyListwithRandomPointer a = new CopyListwithRandomPointer();
		
		AssertUtil.assertRandomListEquals(node1, a.copyRandomList(node1));
	}
}
