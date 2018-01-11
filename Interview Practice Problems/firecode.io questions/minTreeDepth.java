// java.util.* has been imported for this problem.
// You don't need any other imports.

/**
 * Write a non-recursive method minTreeDepth that takes in the root 
 * node of a Binary Tree and returns the minimum depth of the tree. 
 * The minimum depth is defined as the least number of node traversals 
 * needed to reach a leaf from the root node. Your method should run in 
 * linear O(n) time and use at max O(n) space.
 */
public int minTreeDepth(TreeNode root) {
    if(root == null) return 0;
    if(root.right == null && root.left == null) {
        return 1;
    }
    if(root.left == null) {
        return minTreeDepth(root.right);
    }
    if(root.right == null){
        return minTreeDepth(root.left);
    }
    int left = minTreeDepth(root.left);
    int right = minTreeDepth(root.right);
    if(left < right) return left+1;
    return right+1;
}