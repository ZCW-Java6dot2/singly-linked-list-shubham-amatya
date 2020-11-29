package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class TestNode {

    @Test

    public void TestNodeConstructor(){
        int index = 10;
        Node node = new Node(10, null);
        Assert.assertEquals(10, node.getData());
        Assert.assertEquals(null, node.getNext());

    }

    @Test
    public void TestGetterSetter(){
        int index = 10;
        Node node = new Node(10, null);
        node.setIndex(index);
        Assert.assertEquals(index, node.getIndex());
    }

    @Test
    public void TestSetDataValue(){
        int index = 10;
        Node node = new Node(index, null);
        int newNum = 99;
        node.setData(newNum);
        Assert.assertEquals(newNum, node.getData());
    }




}
