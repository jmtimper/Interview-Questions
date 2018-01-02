// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Given a singly-linked list, remove its Nth from the end node.
 */
public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head == null) return null;
    ListNode cur = head;
    int len = 1;
    while(cur.next != null){
        cur = cur.next;
        len++;
    }
    if(n > len) return head;
    if(n == len) return head.next;
    cur = head;
    int pos = 1;
    while(pos < len-n){
        cur = cur.next;
        pos++;
    }
    cur.next = cur.next.next;
    return head;
}