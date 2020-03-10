package _543_Diameter_of_Binary_Tree;

/**
 * Created by muscaestar on 3/10/20
 *
 * @author muscaestar
 */
public class Solution {
    int temp = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        heightPlusOne(root);
        return temp;
    }

    public int heightPlusOne(TreeNode N) {
        if (N == null) {
            return 0;
        }
        int hL = heightPlusOne(N.left);
        int hR = heightPlusOne(N.right);
        temp = Math.max(temp, hL + hR);

        return Math.max(hL, hR) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
