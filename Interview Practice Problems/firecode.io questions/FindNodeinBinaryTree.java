// java.util.* has been imported for this problem.
// You don't need any other imports.


/**
 * Given a binary tree, write a method to find and 
 * return the node with data = the input data. Do not use recursion.
 */
public TreeNode findNode(TreeNode root, int val) {
    if(root == null) return null;
    if(root.data == val) return root;
    TreeNode current = root;
    while(current.left != null){
        if(current.left != null && current.left.data == val) return current.left;
        if(current.right != null && current.right.data == val) return current.right;
        current = current.left;
    }
    current = root;
    while(current.right != null){
        if(current.left != null && current.left.data == val) return current.left;
        if(current.right != null && current.right.data == val) return current.right;
        current = current.right;
    }
    
    return null;




}