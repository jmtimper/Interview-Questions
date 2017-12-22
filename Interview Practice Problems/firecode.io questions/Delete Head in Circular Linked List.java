// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Given a circular linked list, implement a method to delete its head node. 
 * Return the list's new head node.
 */
public ListNode deleteAtHead(ListNode head) {
    if(head == null || head.next == head) return null;
    ListNode tail = head;    
    
    while(tail.next != head){
        tail = tail.next;
    }
    
    head = head.next;
    tail.next = head;
    return head;
    
}