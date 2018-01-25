package com.codecool;

public class SingleLinkedListNode {

    private Object dataItem;
    private SingleLinkedListNode nextNode;

    public SingleLinkedListNode(Object dataItem, SingleLinkedListNode nextNode) {

        this.dataItem = dataItem;
        this.nextNode = nextNode;

    }

    public Object getDataItem() {
        return dataItem;
    }

    public void setDataItem(Object dataItem) {
        dataItem = dataItem;
    }

    public SingleLinkedListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(SingleLinkedListNode nextNode) {
        this.nextNode = nextNode;
    }





}
