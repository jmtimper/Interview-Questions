// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Given a singly-linked list, implement a method to 
 * delete the node at a given position (starting from 1 as the head position) 
 * and return the head of the list. Do nothing if the input position is out of range.
 */
public ListNode deleteAtMiddle(ListNode head, int position) {
    if(head == null) return null;
    ListNode cur = head;
    ListNode prev = head;
    int pos = 1;
    if(position == 1) return head.next;
    while(pos < position && cur.next != null){
        prev = cur;
        cur = cur.next;
        pos++;
    }
    if(pos == position) prev.next = cur.next;
    
    return head;
}