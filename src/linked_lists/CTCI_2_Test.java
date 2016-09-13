package linked_lists;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CTCI_2_Test {
	@Test
	public void removeDuplicatesTest() {
		Node<Integer> head = new Node<Integer>(3);
		Node<Integer> n1 = new Node<Integer>(7);
		Node<Integer> n2 = new Node<Integer>(2);
		Node<Integer> n3 = new Node<Integer>(3);
		Node<Integer> n4 = new Node<Integer>(2);
		Node<Integer> n5 = new Node<Integer>(3);

		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		CTCI_2_1.removeDuplicates(head);
		int[] output = { 3, 7, 2 };
		int i = 0;

		while (head != null) {
			assertEquals((int) head.data, output[i]);
			head = head.next;
			i++;
		}

		head = new Node<Integer>(3);
		n1 = new Node<Integer>(3);
		n2 = new Node<Integer>(3);
		n3 = new Node<Integer>(3);
		n4 = new Node<Integer>(3);
		n5 = new Node<Integer>(3);

		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		CTCI_2_1.removeDuplicates(head);
		int[] output1 = { 3 };
		i = 0;

		while (head != null) {
			assertEquals((int) head.data, output1[i]);
			head = head.next;
			i++;
		}
	}

	@Test
	public void kthToLastTest() {
		Node<Integer> head = new Node<Integer>(3);
		Node<Integer> n1 = new Node<Integer>(7);
		Node<Integer> n2 = new Node<Integer>(2);
		Node<Integer> n3 = new Node<Integer>(4);
		Node<Integer> n4 = new Node<Integer>(2);
		Node<Integer> n5 = new Node<Integer>(5);

		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		assertEquals(CTCI_2_2.kthToLast(head, 1), 5);
		assertEquals(CTCI_2_2.kthToLast(head, 2), 2);
		assertEquals(CTCI_2_2.kthToLast(head, 5), 7);
		assertEquals(CTCI_2_2.kthToLast(head, 6), 3);
	}
}
