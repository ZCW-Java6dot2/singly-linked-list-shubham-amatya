package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    private SinglyLinkedList<String> linkedList;
    private String first;
    private String second;
    private String third;
    private String fourth;


    @Before
    public void init() {
        first = "first";
        second = "second";
        third = "third";
        fourth = "fourth";

        linkedList = new SinglyLinkedList<String>();
        linkedList.add(first);
        linkedList.add(second);
        linkedList.add(third);
        linkedList.add(fourth);

        linkedList.setListLength(5);

    }

    @Test
    public void TestAdd() {
        init();
        Assert.assertEquals(first, linkedList.get(0));
    }


    @Test
    public void TestRemove(){
        init();
        linkedList.remove(1);
        Assert.assertEquals(first, linkedList.get(0));
        Assert.assertEquals(second, linkedList.get(2));
        Assert.assertEquals(third, linkedList.get(3));
    }

    @Test
    public void TestContains(){
        init();
        Assert.assertTrue(linkedList.contains(first));
        Assert.assertTrue(linkedList.contains(second));
        Assert.assertTrue(linkedList.contains(third));
       Assert.assertTrue(linkedList.contains(fourth));
    }

    @Test
    public void TestFind(){
        init();
        Integer expected = 0;
        Integer actual = linkedList.find(first);
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void TestSize(){
        init();
        Integer expected = 5;
        Integer actual = linkedList.getListLength();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCopy(){
        SinglyLinkedList copiedList = linkedList.copy();
        Integer expected = copiedList.size();
        Integer actual = linkedList.size();
        Assert.assertEquals(expected, actual);
    }

}

