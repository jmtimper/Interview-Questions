// java.util.* has been imported for this problem.
// You don't need any other imports.

public ListNode findMiddleNode(ListNode head) {
    if(head == null) return null;
    ListNode fast = head;
    ListNode slow = head;
    int iterator = 1;
    int slowCount = 1;
    if(head.next == null) return slow;
    while(fast.next != null){
        fast = fast.next;
        iterator++;
        if(((iterator+1) / 2) > slowCount){
            slow = slow.next;
            slowCount++;   
        }
    }
    return slow;
    
}