package husama;

import junit.framework.TestCase;

/**
 * Created by hu on 2017/3/6.
 */
public class MyLinkedListTest extends TestCase {
    public void testMyLinkedList(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addToTail(1);
        myLinkedList.addToTail(12);
        myLinkedList.addToTail(4);
        myLinkedList.printListReversinglyIteratively();
        assertEquals("[1,12,4]",myLinkedList.toString());
        myLinkedList.removeNode(12);
        System.out.println(myLinkedList.toString());

    }
}
