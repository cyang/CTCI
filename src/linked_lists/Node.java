package linked_lists;
/**
 * Created by ChrisYang on 8/19/15.
 */
public class Node<T> {
    public T data;
    public Node<T> next = null;

    public Node(T data){
        this.data = data;
    }

    public void appendToTail(T data){
        Node<T> insert = new Node<T>(data);
        Node<T> cursor = this;
        while(cursor.next != null){
            cursor = cursor.next;
        }

        cursor.next = insert;
    }
}
