// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Given a binary tree, write a method to return its size. 
 * The size of a tree is the number of nodes it contains.
 */
public int size(TreeNode root) {
    if(root == null) return 0;
    else return 1 + size(root.left) + size(root.right);

}