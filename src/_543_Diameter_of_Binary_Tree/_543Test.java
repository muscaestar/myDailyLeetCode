package _543_Diameter_of_Binary_Tree;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by muscaestar on 3/10/20
 *
 * @author muscaestar
 */
public class _543Test {

    private Solution s;

    @Before
    public void setUp() throws Exception {
        s = new Solution();
    }

    @Test
    public void testCase1() {
        // init tree
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);


        System.out.println(s.heightPlusOne(root));
        System.out.println(s.diameterOfBinaryTree(root));

    }

    @Test
    public void testCase2() {
        // init tree
        //       1
        //      / \
        //     2   3
        //    / \   \
        //   4   5   7
        //        \
        //         6
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(7);

        System.out.println(s.heightPlusOne(root));
        System.out.println(s.diameterOfBinaryTree(root));
    }
}