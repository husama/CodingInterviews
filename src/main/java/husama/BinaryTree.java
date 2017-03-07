package husama;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by hu on 2017/3/6.
 */
public class BinaryTree<T>
{
    static class BinaryTreeNode<T> {
        T value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }

    private BinaryTreeNode<T> root;


    /**
     *
     * @param pre 包括空节点的前序遍历序列
     * @param toStop 空节点占位符
     *
     */
    public void createBinaryTree(LinkedList<T> pre, T toStop) {
        LinkedList<BinaryTreeNode<T>> stack = new LinkedList<BinaryTreeNode<T>>();
        for(T t : pre) {
            if (t.equals(toStop)) {
                stack.addFirst(null);
            }
            else {
                BinaryTreeNode<T> node = new BinaryTreeNode<T>();
                node.value = t;
            }

        }
    }

    public void createBinaryTreeRecursively(List<T> pre, T toStop) {
        LinkedList preList = new LinkedList(pre);
        root = createBinaryTreeRecursivelyCore(preList, toStop);
    }

    private BinaryTreeNode<T> createBinaryTreeRecursivelyCore(LinkedList<T> pre, T toStop) {
        T data = pre.removeFirst();
        if(data.equals(toStop)) {
            return null;
        }

        BinaryTreeNode<T> node = new BinaryTreeNode<T>();
        node.value = data;
        node.left = createBinaryTreeRecursivelyCore(pre, toStop);
        node.right = createBinaryTreeRecursivelyCore(pre, toStop);

        return node;
    }

    public void preOrder(){
        LinkedList<BinaryTreeNode<T>> stack = new LinkedList<BinaryTreeNode<T>>();
        BinaryTreeNode<T> t = root;

        while( t!=null || !stack.isEmpty()){
            if(t!=null){
                System.out.print(t.value+" ");
                stack.addFirst(t);
                t = t.left;
            } else {
                t = stack.removeFirst();
                t = t.right;
            }
        }
        System.out.println();
    }

    public void inOrder() {
        LinkedList<BinaryTreeNode<T>> stack = new LinkedList<BinaryTreeNode<T>>();
        BinaryTreeNode<T> t = root;
        while(t != null || !stack.isEmpty()) {
            if(t != null) {
                stack.addFirst(t);
                t = t.left;
            } else {
                t = stack.removeFirst();
                System.out.print(t.value+" ");
                t = t.right;
            }
        }

        System.out.println();
    }

    public void postOrder() {
        LinkedList<BinaryTreeNode<T>> s1 = new LinkedList<BinaryTreeNode<T>>();
        LinkedList<BinaryTreeNode<T>> s2 = new LinkedList<BinaryTreeNode<T>>();
        BinaryTreeNode<T> t = root;

        if(t == null) return;

        s1.addFirst(t);

        while(!s1.isEmpty() ) {
            t = s1.removeFirst();
            s2.addFirst(t);
            if(t.left != null) {
                s1.addFirst(t.left);
            }
            if(t.right != null) {
                s1.addFirst(t.right);
            }
        }

        for(BinaryTreeNode<T> node : s2) {
            System.out.print(node.value+" ");
        }
        System.out.println();
    }

    public void levelOrder() {
        LinkedList<BinaryTreeNode<T>> queue = new LinkedList<BinaryTreeNode<T>>();
        BinaryTreeNode<T> t = root;

        if(t == null) return;

        queue.add(t);

        while (!queue.isEmpty()) {
            t = queue.removeFirst();
            System.out.print(t.value+" ");
            if(t.left != null) queue.add(t.left);
            if(t.right != null) queue.add(t.right);
        }
        System.out.println();
    }

    /**
     *
     * @param pre 前序遍历序列
     * @param in 中序遍历序列
     */
    public void buildBinaryTree(List<T> pre, List<T> in) throws Exception{
        if (pre == null || in == null) {
            root = null;
            return;
        } else {
            root = buildBinaryTreeCore(pre, in);
        }
    }

    public BinaryTreeNode<T> buildBinaryTreeCore(List<T> pre, List<T> in) throws Exception{

        T rootValue = pre.get(0);
        BinaryTreeNode<T> tempRoot = new BinaryTreeNode<T>();
        tempRoot.value = rootValue;

        if(pre.size() == 1) {
            if(in.size() == 1 && pre.get(0).equals(in.get(0))) {
                return tempRoot;
            } else {
                throw new Exception("Invalid input");
            }
        }

        int leftLength = 0;
        for(T value : in) {
            if(value.equals(rootValue)) break;
            leftLength++;
        }
        if(leftLength > 0) {
            tempRoot.left = buildBinaryTreeCore(pre.subList(1,leftLength+1), in.subList(0,leftLength));
        }
        if(leftLength < pre.size()-1) {
            tempRoot.right = buildBinaryTreeCore(pre.subList(leftLength+1,pre.size()),in.subList(leftLength+1,in.size()));
        }

        return tempRoot;
    }

}
