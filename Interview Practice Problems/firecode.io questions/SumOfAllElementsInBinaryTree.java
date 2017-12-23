// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Given a binary tree, write a method to find and 
 * return the sum of all the elements using recursion. 
 * For an empty tree the sum is 0.
 */
public int sum(TreeNode root) {
    if(root == null) return 0;
   int num = root.data;
    if(root.left != null) num += sum(root.left);
    if(root.right != null) num += sum(root.right);
    return num;
}