package com.codabase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
public class LinkListReverseTest {


    @Test
    public void testHeadValueBeforeReverse()
    {

        LinkList linkList = new LinkList();
        linkList.create();
        assertEquals("Test Case before Reverse, head is data=10",linkList.getHead().getData(),1);
    }

    @Test
    public void testHeadValueAfterReverse()
    {
        LinkList linkList = new LinkList();
        linkList.create();
        linkList.reverse();
        assertEquals("Test Case after Reverse, head must be 10",linkList.getHead().getData(),10);
    }

    @Test
    public void test2ndValue() {
        LinkList linkList = new LinkList();
        linkList.create();
        assertEquals("Test Case after Reverse, 2nd element is data=9", linkList.getHead().getNext().getData(), 2);
    }

    @Test
    public void test2ndValueAfterReverse() {

        LinkList linkList = new LinkList();
        linkList.create();
        linkList.reverse();
        assertEquals("Test Case after Reverse, 2nd element is data=9",linkList.getHead().getNext().getData(),9);
    }

    @Test
    public void test3rdValue() {
        LinkList linkList = new LinkList();
        linkList.create();
        assertEquals("Test Case after reverse, 3rd element is data=8", linkList.getHead().getNext().getNext().getData(), 3);
    }

    @Test
    public void test3rdValueAfterReverse() {
        LinkList linkList = new LinkList();
        linkList.create();
        linkList.reverse();
        assertEquals("Test Case after reverse, 3rd element should be 8",linkList.getHead().getNext().getNext().getData(),8);
    }

    @Test
    public void test4thValue() {
        LinkList linkList = new LinkList();
        linkList.create();
        assertEquals("Test Case before reverse, 4th element data=4", linkList.getHead().getNext().getNext().getNext().getData(), 4);
    }

    public void test4thValueAfterReverse() {
        LinkList linkList = new LinkList();
        linkList.create();
        linkList.reverse();
        assertEquals("Test Case after reverse, 4th element data=7",linkList.getHead().getNext().getNext().getNext().getData(),
                7);
    }

    @Test
    public void test5thValue() {
        LinkList linkList = new LinkList();
        linkList.create();
        assertEquals("Test Case before reverse, 4th element data=4", linkList.getHead().getNext().getNext().getNext().getNext().getData(), 5);
    }

    public void test5thValueAfterReverse() {
        LinkList linkList = new LinkList();
        linkList.create();
        linkList.reverse();
        assertEquals("Test Case after reverse, 4th element data=7",linkList.getHead().getNext().getNext().getNext().getNext().getData(),
                6);
    }

    @Test
    public void test6thValue() {
        LinkList linkList = new LinkList();
        linkList.create();
        assertEquals("Test Case before reverse, 4th element data=4", linkList.getHead().getNext().getNext().getNext().getNext().getNext().getData(), 6);
    }

    @Test
    public void test6thValueAfterReverse() {
        LinkList linkList = new LinkList();
        linkList.create();
        linkList.reverse();
        assertEquals("Test Case after reverse, 4th element data=7",linkList.getHead().getNext().getNext().getNext().getNext().getNext().getData(),
                5);
    }

}
