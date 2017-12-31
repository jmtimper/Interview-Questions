// java.util.* has been imported for this problem.
// You don't need any other imports.

//max value in tree
int max = Integer.MIN_VALUE;

/**
 * Given a binary tree, write a recursive method to return the maximum element.
 */
public int findMax(TreeNode root) {
    if(root == null) return 0;
    else{
        if(max < root.data) max = root.data;
        findMax(root.left);
        findMax(root.right);
        return max;
    }

}