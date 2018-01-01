// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Given a doubly linked list, implement a method to 
 * insert a node at its head. Return the head of the list.
 */
public DoublyLinkedNode insertAtHead(DoublyLinkedNode head, int data) {
    DoublyLinkedNode node = new DoublyLinkedNode(data);
    node.next = head;
    if(head == null){
        node.prev = head;
    } else {
        node.prev = head.prev;
        head.prev = node;
    }
    return node;
}