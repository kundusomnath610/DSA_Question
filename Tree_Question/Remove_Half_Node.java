package Tree_Question;

import org.w3c.dom.Node;

public class Remove_Half_Node {
    public static void main(String[] args) {
        
    }

    public Node RemoveHalfNodes(Node root) {

        // Base case
        if(root == null) {
            return null;
        }

        // Recursive Case
        root.left = RemoveHalfNodes(root.left);
        root.right = RemoveHalfNodes(root.right);

        if(root.left == null && root.right != null) {
            return root.right;
        }  
        if(root.left != null && root.right == null) {
            return root.left;
        }
        return root;
    }
}

/*
 * You are given a binary tree and you need to remove all the half nodes (which have only one child). Return the root node of the modified tree after removing all the half-nodes.

    Note: The output will be judged by the inorder traversal of the resultant tree, inside the driver code.

    Example:- 1

    Input: tree = 5
            /   \
          7     8
        / 
      2
    Output: 2 5 8
    Explanation: In the above tree, the node 7 has only single child. 
    After removing the node the tree becomes  2<-5->8. 
    Hence, the answer is 2 5 8 & it is in inorder traversal.

    Example:- 2

    Input:  tree = 2   
              / \   
            7   5 
    Output: 7 2 5
    Explanation: Here there are no nodes which has only one child. 
    So the tree remains same.

 */