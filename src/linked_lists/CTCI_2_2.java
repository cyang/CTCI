package linked_lists;

public class CTCI_2_2 {
	// Find kth to last element
	// O(n)
	public static int kthToLast(Node<Integer> head, int k) {
		Node<Integer> cursor = head;

		while (k > 0) {
			// move cursor k nodes away from head
			cursor = cursor.next;
			k--;
		}

		while (cursor != null) {
			// move cursor until the end
			cursor = cursor.next;
			head = head.next;
		}

		return head.data;
	}
}
