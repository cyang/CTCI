import linked_lists.Node;

/**
 * Created by ChrisYang on 9/7/15.
 */
public class Queue {
    Node first, last;

    public void enqueue(Object item){
        if(first == null){
            first = new Node(item);
            last = first;
        } else {
            last.next = new Node(item);
            last = last.next;
        }
    }

    public Object dequeue(){
        if(first != null) {
            Node remove = first;
            first = first.next;
            return remove;
        }
        return null;
    }
}
