package linked_lists;

public class CTCI_2_3 {
	// Delete a node that isn't the first or last
	// Not given the head node of linkedList
	// O(1);
	public static boolean deleteMiddle(Node<Integer> deleteNode) {
		if (deleteNode == null || deleteNode.next == null) {
			return false;
		}

		deleteNode.data = deleteNode.next.data;
		deleteNode.next = deleteNode.next.next;

		return true;
	}
}
