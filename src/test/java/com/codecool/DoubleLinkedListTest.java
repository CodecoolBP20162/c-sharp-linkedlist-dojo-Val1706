package com.codecool;

import junit.framework.TestCase;

public class DoubleLinkedListTest extends TestCase {

    private DoubleLinkedList doubleLinkedList;


    public void setUp() throws Exception {

        doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.addElementAtIndex(0, "first");
        doubleLinkedList.addElementAtIndex(0, "second");
        doubleLinkedList.addElementAtIndex(1, "third");
        doubleLinkedList.addElementAtIndex(2, "four");


    }

    public void testGetSize() throws Exception {

        int listSizeAfterSetUp = 4;
        assertEquals(listSizeAfterSetUp, doubleLinkedList.getSize());

    }

    public void testAddElementAtIndex() throws Exception {

        String testObj = "testObject";
        doubleLinkedList.addElementAtIndex(1, testObj);
        assertEquals(doubleLinkedList.nodeAtIndex(1).getDataItem(), testObj);
    }

    public void testRemoveElementAtIndex() throws Exception {

        int index = 2;

        Object beforeRemoving = doubleLinkedList.nodeAtIndex(index).getDataItem();
        doubleLinkedList.removeElementAtIndex(index);
        Object afterRemoving = doubleLinkedList.nodeAtIndex(index).getDataItem();

        assertTrue(beforeRemoving != afterRemoving);
    }
}