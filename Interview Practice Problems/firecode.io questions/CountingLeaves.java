// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Write a function to find the total number of leaf nodes in a binary tree.
 * A node is described as a leaf node if it doesn't have any children.
 * If there are no leaf nodes, return 0.
 */
public int numberOfLeaves(TreeNode root) { 
    int count = 0;
    if(root == null) return 0;
    if(root.left == null && root.right == null){
        count++;
    }
    if(root.left != null){
        count += numberOfLeaves(root.left);
    }
    if(root.right != null){
        count += numberOfLeaves(root.right);
    }
    return count;
}