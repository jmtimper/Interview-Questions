// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Given a circular-linked list, write a function 
 * to delete its tail node and return the modified list's head.
 */
public ListNode deleteAtTail(ListNode head) {
    if(head == null) return null;
    ListNode current = head;
    ListNode prev = head;
    while(current.next != head){
        prev = current;
        current = current.next;
    }
    current = current.next;
    prev.next = current;

    return current;

}