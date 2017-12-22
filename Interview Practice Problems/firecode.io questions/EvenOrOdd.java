// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Given a singly-linked list, check whether its length is even or odd in a single pass. 
 * An Empty list has 0 nodes which makes the number of nodes in it even.
 */
public Boolean isListEven(ListNode head) {
    if(head == null) return true;
    int num = 1;
    while(head.next != null){
        num++;
        head = head.next;
    }
    if(num % 2 == 0) return true;
    return false;
}