package com.zipcodewilmington.singlylinkedlist;


/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<randomType extends Comparable<randomType>> {
    private Node<randomType> head;
    private Node<randomType> tail;
    private int listCount;
    private int listLength;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        listCount = 0;

    }

    public void incrementListCount() {
        listCount++;
    }

    public void decrementListCount() {
        listCount--;
    }

    public int getListCount() {
        return listCount;
    }

    public int getListLength() {
        return listLength;
    }

    public void setListLength(int listLength) {
        this.listLength = listLength;
    }

    public void add(randomType data) { //to add the element to the end of the list


        Node singlyTemp = new Node<randomType>(data);

        if (head == null) {
            head = new Node<randomType>(data);
        }
        Node singlyCurrent = head;
        while (singlyCurrent.getNext() != null) {
            singlyCurrent = singlyCurrent.getNext();
        }
        singlyCurrent.setNext(singlyTemp);
        listCount++;

    }


    public void remove(Integer index) {
        Node currentNode;
        if (head != null) {
            currentNode = head;
            for (int i = 0; i <= index; i++) {
                if (currentNode.getNext() != null) {
                    currentNode = currentNode.getNext();
                }
            }
            currentNode.setNext(currentNode.getNext());
        }
        decrementListCount();

    }

    public Boolean contains(randomType data) {
        Node<randomType> currentNode = head;
        if (head == null) {
            return false;
        } else {
            for (int i = 0; i < getListLength(); i++) {
                if (currentNode.getData().equals(data)) {
                    return true;
                }
                currentNode = currentNode.getNext();
            }
        }
        return false;
    }

    public Integer find(randomType data) {
        Node currentNode = head;
        if (head == null) {
            return -1;
        }
        for (int i = 0; i < listLength; i++) {
            if (currentNode.getData().equals(data)) {
                return i;
            }
            currentNode = currentNode.getNext();
        }
        return -1;
    }

    public int size() {
        return getListCount();
    }

    public randomType get(Integer index) {
        int tempIndex = head.getIndex();
        Node<randomType> tempNode = head;
        while (tempIndex != index) {
            tempIndex++;
            tempNode = tempNode.getNext();
        }
        return tempNode.getData();

    }

    public SinglyLinkedList copy() {
        SinglyLinkedList copy = new SinglyLinkedList();
        randomType tempNode = null;
        Node currentNode = head.getNext();
        if (currentNode != null) {
            while (currentNode.getNext() != null) {
                tempNode = (randomType) currentNode.getData();
                copy.add(tempNode);
                currentNode = currentNode.getNext();
            }
            copy.add((Comparable) currentNode.getData());
        }
        return copy;
    }

}
