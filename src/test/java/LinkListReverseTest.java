import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
public class LinkListReverseTest {

    private Node head = new Node();

    private void create()
    {
        Node node = null;
        for (int i=1;i<=10;i++)
        {
            if (i==1)
            {
                node = new Node();
                node.setData(i);
                node.setNext(node);
                head=node;
            } else {
                Node nextNode = new Node();
                node.setNext(nextNode);
                nextNode.setData(i);
                node = nextNode;
            }
        }
    }


    @Test
    public void testHeadValueBeforeReverse()
    {
        create();
        LinkList linkList = new LinkList();
        linkList.setHead(head);
        assertEquals("Test Case before Reverse, head is data=10",linkList.getHead().getData(),1);
    }

    @Test
    public void testHeadValueAfterReverse()
    {
        create();
        LinkList linkList = new LinkList();
        linkList.setHead(head);
        linkList.reverse();
        assertEquals("Test Case after Reverse, head must be 10",linkList.getHead().getData(),10);
    }

    @Test
    public void test2ndValue() {
        LinkList linkList = new LinkList();
        create();
        linkList.setHead(head);
        assertEquals("Test Case after Reverse, 2nd element is data=9", linkList.getHead().getNext().getData(), 2);
    }

    @Test
    public void test2ndValueAfterReverse() {
        create();
        LinkList linkList = new LinkList();
        linkList.setHead(head);
        linkList.reverse();
        assertEquals("Test Case after Reverse, 2nd element is data=9",linkList.getHead().getNext().getData(),9);
    }

    @Test
    public void test3rdValue() {
        LinkList linkList = new LinkList();
        create();
        linkList.setHead(head);
        assertEquals("Test Case after reverse, 3rd element is data=8", linkList.getHead().getNext().getNext().getData(), 3);
    }

    @Test
    public void test3rdValueAfterReverse() {
        LinkList linkList = new LinkList();
        create();
        linkList.setHead(head);
        linkList.reverse();
        assertEquals("Test Case after reverse, 3rd element should be 8",linkList.getHead().getNext().getNext().getData(),8);
    }

    @Test
    public void test4thValue() {
        LinkList linkList = new LinkList();
        create();
        linkList.setHead(head);
        assertEquals("Test Case before reverse, 4th element data=4", linkList.getHead().getNext().getNext().getNext().getData(), 4);
    }
    
    public void test4thValueAfterReverse() {
        LinkList linkList = new LinkList();
        create();
        linkList.setHead(head);
        linkList.reverse();
        assertEquals("Test Case after reverse, 4th element data=7",linkList.getHead().getNext().getNext().getNext().getData(),
                7);
    }

    @Test
    public void test5thValue() {
        LinkList linkList = new LinkList();
        create();
        linkList.setHead(head);
        assertEquals("Test Case before reverse, 4th element data=4", linkList.getHead().getNext().getNext().getNext().getNext().getData(), 5);
    }

    public void test5thValueAfterReverse() {
        LinkList linkList = new LinkList();
        create();
        linkList.setHead(head);
        linkList.reverse();
        assertEquals("Test Case after reverse, 4th element data=7",linkList.getHead().getNext().getNext().getNext().getNext().getData(),
                6);
    }

    @Test
    public void test6thValue() {
        LinkList linkList = new LinkList();
        create();
        linkList.setHead(head);
        assertEquals("Test Case before reverse, 4th element data=4", linkList.getHead().getNext().getNext().getNext().getNext().getNext().getData(), 6);
    }

    @Test
    public void test6thValueAfterReverse() {
        LinkList linkList = new LinkList();
        create();
        linkList.setHead(head);
        linkList.reverse();
        assertEquals("Test Case after reverse, 4th element data=7",linkList.getHead().getNext().getNext().getNext().getNext().getNext().getData(),
                5);
    }

}
