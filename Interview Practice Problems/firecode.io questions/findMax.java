/**
 * Given a Binary Search Tree, 
 * return the node with the maximum data.
 */
public TreeNode findMax(TreeNode root) {
    if(root == null) return root;
    int max = root.data;
    if(root.left != null){
        max = Math.max(max, findMax(root.left));
    }
    if(root.right != null){
        max = Math.max(max, findMax(root.right));
    }
    return max;
}