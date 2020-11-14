package Problem1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
https://www.geeksforgeeks.org/level-order-tree-traversal/
 */
public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {
        // homework
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode<Integer>> data = new LinkedList<>();

        if (root == null) {
            return result;
        }

        List<Integer> list = new ArrayList<>();
        data.add(root);
        data.add(null);

        while (data.size() > 0) {
            TreeNode<Integer> temp = data.poll();
            if (temp == null) {
                result.add(list);
                if (!data.isEmpty()) {
                    data.add(null);
                    list = new ArrayList<>();
                }
            } else {
                if (temp.left != null) {
                    data.add(temp.left);
                }
                if (temp.right != null) {
                    data.add(temp.right);
                }
                list.add(temp.val);
            }
        }
        return result;  // place holder
    }
}

