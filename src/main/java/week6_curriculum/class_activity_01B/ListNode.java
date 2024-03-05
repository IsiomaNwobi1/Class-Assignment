package week6_curriculum.class_activity_01B;

import org.w3c.dom.Node;

public class ListNode {


    //data is the actual value stored in the node (the value can be called Node)
    //this is what you're going to store in your Node when you call it.
    Object data;


    //next is the reference to the next node in the sequence
    Node next;


    //prev is the reference to the previous in the sequence.
    //if the question is not a doubly linked list, there's no need to use prev.
    //if it's a doubly linked list, then you should use prev.
    Node prev;

    public ListNode(Object data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }


}
