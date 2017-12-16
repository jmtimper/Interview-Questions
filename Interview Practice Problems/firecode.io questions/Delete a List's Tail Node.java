// java.util.* has been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtTail(ListNode head) {
    if(head == null || head.next == null){
        return null;
    }
    ListNode iter = head;
    while((iter.next).next != null){
        iter = iter.next;
    }
    iter.next = null;
    return head;

    
}