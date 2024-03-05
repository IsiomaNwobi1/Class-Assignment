package week6_curriculum.class_activity_03A;

public class LinkedListCycleDetector {
    public static boolean hasCycle(ListNode head) {

        if(head == null || head.next == null) {
            return false; //no cycle if the list is empty or has only Node or element
        }

        ListNode slow = head;
        ListNode fast = head.next; //move fast pointer one step ahead

        //iterate until fast pointer reaches end of the list
        //or slow pointer meets fast pointer (which means at that point, a cycle has been detected).
        while (fast != null && fast.next != null) {
            if(slow == fast){
                return true; //cycle detected (at this point, you can stop looping).
            }
            slow = slow.next; //move slow pointer by one step.
            fast = fast.next.next; //move fast pointer by two step.

        }
        return false; //no cycle found
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next;
        head.next = null;

        System.out.println("Does the linked list contain a cycle? " + hasCycle(head));
    }
}
