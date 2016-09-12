package linked_lists;

/**
 * Created by ChrisYang on 8/31/15.
 */

public class CTCI_2_5 {
	public static void main(String[] args) {
		// 4321
		Node<Integer> head_a = new Node<Integer>(1);
		head_a.next = new Node<Integer>(2);
		head_a.next.next = new Node<Integer>(3);
		head_a.next.next.next = new Node<Integer>(4);

		// 4321
		Node<Integer> head_b = new Node<Integer>(1);
		head_b.next = new Node<Integer>(2);
		head_b.next.next = new Node<Integer>(3);
		head_b.next.next.next = new Node<Integer>(4);

		// 8642
		Node head_c = sumLists(head_a, head_b);

	}

	public static Node sumLists(Node<Integer> head_a, Node<Integer> head_b) {
		int a = 0;
		int b = 0;
		int count = 0;
		int sum = 0;

		while (head_a != null) {
			a += head_a.data * Math.pow(10, count);
			head_a = head_a.next;
			count++;
		}

		count = 0;
		while (head_b != null) {
			a += head_b.data * Math.pow(10, count);
			head_b = head_b.next;
			count++;
		}

		sum = a + b;
		Node head_c = null;
		Node tail_c = null;

		while (sum != 0) {
			if (head_c == null) {
				head_c = new Node(sum % 10);
				tail_c = head_c;
			} else {
				Node insert = new Node(sum % 10);
				tail_c.next = insert;
				tail_c = tail_c.next;
			}

			sum /= 10;
		}

		return head_c;

	}

}
