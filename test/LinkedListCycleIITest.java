import static org.junit.Assert.*;

import org.junit.Test;


public class LinkedListCycleIITest {


	@Test
	public void test() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node2;
		
		
		LinkedListCycleII a = new LinkedListCycleII();
		assertEquals(node2, a.detectCycle(node1));
	}
	
	@Test
	public void test2() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		
		LinkedListCycleII a = new LinkedListCycleII();
		assertEquals(null, a.detectCycle(node1));
	}
	
	@Test
	public void test3() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		node1.next = node2;
		node2.next = node1;
		
		
		LinkedListCycleII a = new LinkedListCycleII();
		assertEquals(node1, a.detectCycle(node1));
	}
	
	@Test
	public void test4() {
		ListNode node1 = new ListNode(1);
		node1.next = node1;
		
		
		LinkedListCycleII a = new LinkedListCycleII();
		assertEquals(node1, a.detectCycle(node1));
	}
	
	@Test
	public void test5() {
		ListNode node1 = new ListNode(1);
		
		
		LinkedListCycleII a = new LinkedListCycleII();
		assertEquals(null, a.detectCycle(node1));
	}

}
