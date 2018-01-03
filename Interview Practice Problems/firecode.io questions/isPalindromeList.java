// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Given a singly-linked list, write a method isListPalindrome 
 * to determine if the list is a palindrome. A palindrome 
 * is a sequence that reads the same backward as forward.
 */
public Boolean isListPalindrome(ListNode head) {
    Stack<ListNode> stack = new Stack<ListNode>();
    if(head == null) return true;
    ListNode cur = head;
    while(cur.next != null){
        stack.push(cur);
        cur = cur.next;
    }
    cur = head;
    while(cur.next != null){
        ListNode node = stack.pop();
        if(node.data != cur.data) return false;
        cur = cur.next;
    }
    return true;

}