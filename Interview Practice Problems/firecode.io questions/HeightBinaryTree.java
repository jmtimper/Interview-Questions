// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Given a binary tree, write a method to find its height recursively.
 * An empty tree has a height of 0.
 */
public int findHeight(TreeNode root) { 
    if(root == null) return 0;
    
    int leftH = findHeight(root.left);
    int rightH = findHeight(root.right);
    
    if(leftH > rightH){
        return leftH + 1;
    } else {
        return rightH + 1;
    }

}