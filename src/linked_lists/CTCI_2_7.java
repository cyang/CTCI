package linked_lists;

/**
 * Created by ChrisYang on 9/7/15.
 */
public class CTCI_2_7 {

	public static void main(String[] args) {
		Node a = new Node(0);
		a.appendToTail(1);
		a.appendToTail(0);

		if (isPalindrome(a))
			System.out.println("This is a palindrome");
		else
			System.out.println("This isn't a palindrome");
	}

	public static boolean isPalindrome(Node head) {
		Node reversedHead = null;
		Node cursor = head;
		int count = 0;

		while (cursor != null) {
			Node temp = reversedHead;
			reversedHead = new Node(cursor.data);
			reversedHead.next = temp;

			cursor = cursor.next;
			count++;
		}

		cursor = head;
		Node cursor_reversed = reversedHead;

		for (int i = 0; i < count / 2; i++) {
			if (cursor.data != cursor_reversed.data)
				return false;

			cursor = cursor.next;
			cursor_reversed = cursor_reversed.next;
		}

		return true;
	}

}
