package com.codecool;

public class DoubleLinkedList {

    private DoubleLinkedListNode head;
    private int size;



    public DoubleLinkedList(){
        this.head = new DoubleLinkedListNode (null,null,null);
    }



    public void addElementAtIndex(int index, Object data) throws Exception {

        if (index == 0) {
            DoubleLinkedListNode newNode = new DoubleLinkedListNode(data, head.getNextNode(), head);
            head.setNextNode(newNode);
            size++;
        } else {
            DoubleLinkedListNode prevNode = nodeAtIndex(index - 1);
            if (prevNode != null) {
                DoubleLinkedListNode nextNode = prevNode.getNextNode();
                DoubleLinkedListNode newNode = new DoubleLinkedListNode(data, nextNode, prevNode);
                prevNode.setNextNode(newNode);
                nextNode.setPrevNode(newNode);
                size++;
            } else {
                throw new IndexOutOfBoundsException("Index greater than list size" );
            }
        }
    }

    public void removeElementAtIndex(int index) throws Exception {
        if (index == 0) {
            DoubleLinkedListNode toBeDeletedNode = head.getNextNode();
            if (toBeDeletedNode != null) {
                DoubleLinkedListNode nextNode = toBeDeletedNode.getNextNode();
                head.setNextNode(nextNode);
                nextNode.setPrevNode(head);
                toBeDeletedNode.setNextNode(null);
                toBeDeletedNode.setPrevNode(null);
                size--;
            } else {
                System.out.println("No nodes to be deleted");
            }
        } else{
            DoubleLinkedListNode prevNode = nodeAtIndex(index - 1);
            if (prevNode != null) {
                DoubleLinkedListNode targetNode = prevNode.getNextNode();
                DoubleLinkedListNode nextNode = targetNode.getNextNode();
                prevNode.setNextNode(nextNode);
                nextNode.setPrevNode(prevNode);
                targetNode.setNextNode(null);
                targetNode.setPrevNode(null);
                size--;
            } else {
                throw new IndexOutOfBoundsException("Index greater than list size" );
            }
        }
    }

    public DoubleLinkedListNode nodeAtIndex(int index){
        if(index<0){
            return null;
        }else{
            DoubleLinkedListNode node=head.getNextNode();
            int i=0;
            while(i < index && node != null){
                node=node.getNextNode();
                i++;
            }
            return node;
        }
    }

    public int getSize() {
        return size;
    }


}
