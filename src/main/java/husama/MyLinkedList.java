package husama;

/**
 * Created by hu on 2017/3/6.
 */


import java.util.LinkedList;

/**
 * 仅作算法练习用
 *
 */
public class MyLinkedList<T> {

    private ListNode<T> head;//头节点，不储存值

    public MyLinkedList() {
        head = new ListNode<T>();
    }

    static class ListNode<T> {
        T value;
        ListNode<T> next;
    }

    public void addToTail(T value) {
        ListNode<T> newNode = new ListNode<T>();
        newNode.next = null;
        newNode.value = value;

        ListNode<T> pNode = head;

        while (pNode.next != null) {
            pNode = pNode.next;
        }

        pNode.next = newNode;
    }

    public void removeNode(T value) {

        if(head.next == null) return;

        ListNode<T> preToBeRemoved = head;

        while (preToBeRemoved.next != null && preToBeRemoved.next.value != value) {
            preToBeRemoved = preToBeRemoved.next;
        }

        if(preToBeRemoved.next != null && preToBeRemoved.next.value == value) {
            preToBeRemoved.next = preToBeRemoved.next.next;
        }

    }

    public void printListReversinglyIteratively() {
        LinkedList<ListNode<T>> nodes = new LinkedList<ListNode<T>>();

        ListNode node = head.next;
        while (node != null) {
            nodes.add(node);
            node = node.next;
        }

        while (!nodes.isEmpty()) {
            node = nodes.removeLast();
            System.out.print(node.value+" ");
        }
        System.out.println();
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode<T> pNode = head.next;

        while (pNode != null) {
            sb.append(pNode.value);
            if(pNode.next !=null){
                sb.append(",");
            }

            pNode = pNode.next;
        }

        sb.append("]");

        return sb.toString();
    }
}
