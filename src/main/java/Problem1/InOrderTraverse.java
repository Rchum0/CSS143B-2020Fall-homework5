package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
https://www.educative.io/edpresso/how-to-perform-an-iterative-inorder-traversal-of-a-binary-tree
 */
public class InOrderTraverse {
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {
        // homework

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) {
            return result;
        }

        stack.push(root);
        TreeNode curr = stack.peek();

        while (stack.size() != 0) {
            curr = stack.peek();
            if (curr.left != null) {
                stack.push(curr.left);
                curr.left = null;
                continue;
            }

            result.add((Integer) curr.val);
            stack.pop();

            if (curr.right != null) {
                stack.push(curr.right);
                curr.right = null;
                continue;
            }
        }
        return result;  // place holder
    }
}
