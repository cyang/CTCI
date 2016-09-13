package linked_lists;

public class CTCI_2_2 {
	// Find kth to last element
	public static int kthToLast(Node<Integer> head, int k) {
		int count = 0;
		Node<Integer> cursor = head;

		while (cursor != null) {
			count++;
			cursor = cursor.next;
		}

		int diff = count - k;
		while (diff > 0) {
			head = head.next;
			diff--;
		}

		return head.data;
	}
}
