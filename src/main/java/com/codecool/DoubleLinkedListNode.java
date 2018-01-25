package com.codecool;

import java.util.NoSuchElementException;

public class DoubleLinkedListNode {

    private Object DataItem;
    private DoubleLinkedListNode nextNode;
    private DoubleLinkedListNode prevNode;

    public DoubleLinkedListNode(Object dataItem, DoubleLinkedListNode nextNode, DoubleLinkedListNode prevNode) {

        this.DataItem = dataItem;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }



    public Object getDataItem() {
        return DataItem;
    }

    public void setDataItem(Object dataItem) {
        DataItem = dataItem;
    }

    public DoubleLinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleLinkedListNode nextNode) {
        this.nextNode = nextNode;
    }

    public DoubleLinkedListNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DoubleLinkedListNode prevNode) {
        this.prevNode = prevNode;
    }
}
