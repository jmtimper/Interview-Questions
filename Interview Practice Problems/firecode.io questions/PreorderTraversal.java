// java.util.* has been imported for this problem.
// You don't need any other imports.

//Populated the elements of the tree  in the below list in preorder format
ArrayList<Integer> preorderedList = new ArrayList<Integer>();

/**
 * Given a binary tree, write a method to recursively traverse the 
 * tree in the preorder manner. Mark a node as visited by adding 
 * its data to the list - Arraylist <Integer> preorderedList.
 */
public void preorder(TreeNode root) {
   if(root == null) return;
   
   preorderedList.add(root.data);
    
    preorder(root.left);
    
    preorder(root.right);

}