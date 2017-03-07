package husama;

import junit.framework.TestCase;


import java.util.Arrays;

import java.util.List;


/**
 * Created by hu on 2017/3/7.
 */
public class BinaryTreeTest extends TestCase {
    public void testCreateBinaryTree(){
        BinaryTree<Character> binaryTree = new BinaryTree<Character>();

        List<Character> list = Arrays.asList('a','b','c','#','#','#','d','#','#');

        binaryTree.createBinaryTreeRecursively(list,'#');

        binaryTree.preOrder();
        binaryTree.inOrder();
        binaryTree.postOrder();
        binaryTree.levelOrder();
    }

    public void testBuildBinaryTree() {
        BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();

        List<Integer> pre = Arrays.asList(1,2,4,7,3,5,6,8);
        List<Integer> in = Arrays.asList(4,7,2,1,5,3,8,6);

        try {
            binaryTree.buildBinaryTree(pre,in);
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

        binaryTree.preOrder();
        binaryTree.inOrder();
        binaryTree.postOrder();
        binaryTree.levelOrder();

    }
}
