package com.zipcodewilmington.singlylinkedlist;

public class Node<randomType> {


        private randomType data;
        private Node next;
        private int index = 0;



        public Node(randomType dataValue) {
            data = dataValue;
            next = null;

        }

        public Node(randomType dataValue, Node nextValue) {
            next = nextValue;
            data = dataValue;

        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public randomType getData() {
            return data;
        }

        public void setData(randomType data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

}
