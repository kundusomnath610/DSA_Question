package Tree_Question;

public class RemoveHalfNode {

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = null;
        root.right.left = null;
        root.right.right = new TreeNode(5);

        RemoveHalfNode remover = new RemoveHalfNode();
        root = remover.removeHalfNodes(root);

        // Function to print tree (in-order traversal)
        printInOrder(root);
    }

    public TreeNode removeHalfNodes(TreeNode root) {
        // Base case
        if (root == null) {
            return null;
        }

        // Recursive case
        root.left = removeHalfNodes(root.left);
        root.right = removeHalfNodes(root.right);

        // If this is a half node with only right child
        if (root.left == null && root.right != null) {
            return root.right;
        }

        // If this is a half node with only left child
        if (root.left != null && root.right == null) {
            return root.left;
        }

        // If this is a full node or a leaf node
        return root;
    }

    // Helper function to print tree in-order
    public static void printInOrder(TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);
        }
    }

    // Custom TreeNode class
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int item) {
            data = item;
            left = right = null;
        }
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