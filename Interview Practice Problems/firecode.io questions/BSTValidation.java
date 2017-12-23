/**
 * Given the root node of a Binary Tree, determine if it is a Binary Search Tree.
 */
public static boolean validateBST(TreeNode root) {
   return validateBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}

public static boolean validateBST(TreeNode root, int min, int max){
    if(root == null) return true;
    if(root.data >= max || root.data <= min) return false;
    return validateBST(root.left, min, root.data) && validateBST(root.right, root.data, max);
}