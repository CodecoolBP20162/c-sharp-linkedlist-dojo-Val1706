package com.codecool;

import junit.framework.TestCase;

public class SinglyLinkedListTest extends TestCase {

    private SinglyLinkedList singlyLinkedList;

    public void setUp() throws Exception {

        singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addElementAtIndex(0, "test1");
        singlyLinkedList.addElementAtIndex(0, "test2");
        singlyLinkedList.addElementAtIndex(1, "test3");
        singlyLinkedList.addElementAtIndex(2, "test4");
    }

    public void testAddAtBegin() throws Exception {

        String testObject = "testObject";
        singlyLinkedList.addAtBegin(testObject);
        assertEquals(singlyLinkedList.nodeAtIndex(0).getDataItem(), testObject);
    }

    public void testAddElementAtIndex() throws Exception {

        String testObject = "testObject";
        singlyLinkedList.addElementAtIndex(2, testObject);
        assertEquals(singlyLinkedList.nodeAtIndex(2).getDataItem(), testObject);
    }

    public void testGetSize() throws Exception {

        int listSize = 4;
        assertEquals(singlyLinkedList.getSize(), listSize);
    }

    public void testRemoveAtIndex(){

        int index = 2;
        Object beforeRemoving = singlyLinkedList.nodeAtIndex(index).getDataItem();
        singlyLinkedList.removeAtIndex(2);
        Object afterRemoving = singlyLinkedList.nodeAtIndex(index).getDataItem();
        assertTrue(beforeRemoving != afterRemoving);
    }



}