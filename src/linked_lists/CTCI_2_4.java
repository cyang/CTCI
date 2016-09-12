package linked_lists;

/**
 * Created by ChrisYang on 8/30/15.
 */
public class CTCI_2_4 {
	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(5);
		head.next = new Node<Integer>(15);
		head.next.next = new Node<Integer>(10);
		head.next.next.next = new Node<Integer>(1);

		Node partitioned = partition(head, 9);
	}

	public static Node partition(Node<Integer> head, int x) {
		Node beforeHead = null;
		Node beforeTail = null;
		Node afterHead = null;
		Node afterTail = null;

		while (head != null) {
			Node<Integer> next = head.next;
			head.next = null;

			if (head.data < x) {
				if (beforeHead == null) {
					beforeHead = head;
					beforeTail = beforeHead;
				} else {
					beforeTail.next = head;
					beforeTail = head;
				}
			} else {
				if (afterHead == null) {
					afterHead = head;
					afterTail = afterHead;
				} else {
					afterTail.next = head;
					afterTail = head;
				}
			}
			head = next;
		}

		if (beforeHead == null)
			return afterHead;

		beforeTail.next = afterHead;
		return beforeHead;
	}
}
