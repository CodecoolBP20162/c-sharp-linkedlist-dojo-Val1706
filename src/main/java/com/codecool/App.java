package com.codecool;

import java.util.ListIterator;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        System.out.println("Hello World!");

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        try {
            singlyLinkedList.addElementAtIndex(0, "word1");
            singlyLinkedList.addElementAtIndex(0, "word2");
            singlyLinkedList.addElementAtIndex(1, "word3");
            singlyLinkedList.addElementAtIndex(2, "word4");
            singlyLinkedList.addAtBegin("wordBegin");
//            singlyLinkedList.addElementAtIndex(1, "word2");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
