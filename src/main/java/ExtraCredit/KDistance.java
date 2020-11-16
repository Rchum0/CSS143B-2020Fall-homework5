package ExtraCredit;

import Problem1.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
https://www.geeksforgeeks.org/print-nodes-distance-k-given-node-binary-tree/
 */
public class KDistance {
    public static List<Integer> distanceK(TreeNode<Integer> root, TreeNode<Integer> target, int k) {
        // homework
        List<Integer> result = new ArrayList<>();
        secondHelper(root, target, k, result);
        return result;
    }

    private static List<Integer> helper(TreeNode<Integer> node, int k, List<Integer> data) {
        if (node == null || k < 0) {
            return data;
        }

        if (k == 0) {
            data.add(node.val);
            return data;
        }

        helper(node.left, k - 1, data);
        helper(node.right, k - 1, data);
        return data;
    }

    private static int secondHelper(TreeNode<Integer> root, TreeNode<Integer> target, int k, List<Integer> data) {
        if (root == null) {
            return -1;
        }

        if (root == target) {
            helper(target, k, data);
            return 0;
        }

        int left = secondHelper(root.left, target, k, data);

        if (left != -1) {
            if (left + 1 == k) {
                data.add(root.val);
            } else {
                helper(root.right, k - left - 2, data);
            }
            return 1 + left;
        }

        int right = secondHelper(root.right, target, k, data);

        if (right != -1) {
            if (right + 1 == k) {
                data.add(root.val);
            } else {
                helper(root.left, k - right - 2, data);
            }
            return 1 + right;
        }
        return -1;
    }
}
