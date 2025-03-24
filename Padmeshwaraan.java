import java.util.*;

class Padmeshwaraan {
    List<Integer> res = new ArrayList<>();

    void fun(TreeNode root) {
        if (root != null) {
            fun(root.left);
            res.add(root.val);
            fun(root.right);
        }

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        fun(root);
        return res;
    }
}