package com.codecool;

public class SinglyLinkedList {

    private SingleLinkedListNode head;
    private int size;

    public SinglyLinkedList() {

        this.head = new SingleLinkedListNode(null, null);

    }

    public void addAtBegin(Object data) throws Exception{
        addElementAtIndex(0, data);
    }

    public void addElementAtIndex(int index, Object data) throws Exception {

        if (index == 0) {
            SingleLinkedListNode newNode = new SingleLinkedListNode(data, head.getNextNode());
            head.setNextNode(newNode);

            size++;

        } else {



            SingleLinkedListNode previousNode = nodeAtIndex(index - 1);

            if (previousNode != null) {

                SingleLinkedListNode currentNode = previousNode.getNextNode();
                SingleLinkedListNode newNode = new SingleLinkedListNode(data, currentNode);
                previousNode.setNextNode(newNode);
                newNode.setNextNode(currentNode);
                size ++;
            }
        }
    }

    public void removeAtIndex(int index) {

        if (index == 0) {

            SingleLinkedListNode nodeToDelete = head.getNextNode();
            if(nodeToDelete != null) {
                head.setNextNode(nodeToDelete.getNextNode());
                nodeToDelete.setNextNode(null);
                size--;
            }else{
                System.out.println("No nodes to be deleted");
            }

        } else {

            SingleLinkedListNode nodeBefore = nodeAtIndex(index - 1);
            if (nodeBefore != null) {

                SingleLinkedListNode nodeToDelete = nodeBefore.getNextNode();
                nodeBefore.setNextNode(nodeToDelete.getNextNode());
                nodeToDelete.setNextNode(null);
                size--;

            } else {
                throw new IndexOutOfBoundsException("Index greater than list size");
            }
        }
    }


    public SingleLinkedListNode nodeAtIndex(int index){
        if(index<0){
            return null;
        }else{
            SingleLinkedListNode node=head.getNextNode();
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
