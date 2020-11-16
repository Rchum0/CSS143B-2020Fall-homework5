package Problem3;

import Problem1.TreeNode;

/*
https://www.softwaretestinghelp.com/binary-search-tree-in-java/
 */
public class InsertInBST {
    public static void insert(TreeNode<Integer> root, int valToInsert) {
        // homework
        if (valToInsert > root.val) {
            if (root.right == null) {
                root.right = new TreeNode<Integer>(valToInsert);
            } else {
                insert(root.right, valToInsert);
            }
        } else if (root.left == null) {
            root.left = new TreeNode<Integer>(valToInsert);
        } else {
            insert(root.left, valToInsert);
        }
    }
}
