// java.util.* has been imported for this problem.
// You don't need any other imports.


/**
 * Given a binary tree, write a method to iteratively traverse the tree in the preorder manner. 
 * Mark a node as visited by adding its data to a list - Arraylist <Integer> preorderedList. 
 * Return this list.
 */
public ArrayList<Integer> preorderItr(TreeNode root) {
    if(root == null) return new ArrayList<Integer>();
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(root.data);
    if(root.left != null) branches(root.left, list);
    if(root.right != null) branches(root.right, list);
    return list;
}

private ArrayList<Integer> branches(TreeNode root, ArrayList<Integer> list){
    list.add(root.data);
    if(root.left != null) branches(root.left, list);
    if(root.right != null) branches(root.right, list);
    return list;
}