// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Write a method to insert a node at the front of a 
 * singly-linked list and return the head of the modified list.
 */
public ListNode insertAtHead(ListNode head, int data) {
    ListNode node = new ListNode(data);
    node.next = head;
    return node;

}