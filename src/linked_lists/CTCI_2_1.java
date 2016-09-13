package linked_lists;

import java.util.HashSet;
import java.util.Set;

public class CTCI_2_1 {
	// Remove duplicates
	public static void removeDuplicates(Node<Integer> head) {
		Set<Integer> set = new HashSet<Integer>();
		Node<Integer> prev = null;

		while (head != null) {
			if (set.contains(head.data)) {
				prev.next = head.next;
			} else {
				set.add(head.data);
				prev = head;
			}
			head = head.next;

		}
	}
}
