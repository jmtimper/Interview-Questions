// java.util.* has been imported for this problem.
// You don't need any other imports.

public ListNode insertAtTail(ListNode head, int data) {
    if(head == null) {
        head = new ListNode(data);
        return head;
    }
    
    ListNode iter = head;
    while(iter.next != null){
        iter = iter.next;
    }
    ListNode list = new ListNode(data);
    iter.next = list;
    return head;

}