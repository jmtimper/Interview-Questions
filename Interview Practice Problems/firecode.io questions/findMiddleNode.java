// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Given a Singly-Linked List, write a method - 
 * findMiddleNode that finds and returns the middle node of the list in a single pass.
 */
public ListNode findMiddleNode(ListNode head) {
    if(head == null) return null;
    ListNode middle = head;
    int move = 1;
    while(head.next != null){
        head = head.next;
        move++;
        if(move%2 == 1){
            System.out.println(move);
            middle = middle.next;
        }
    }
    return middle;
    

}