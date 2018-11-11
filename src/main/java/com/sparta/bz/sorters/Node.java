package com.sparta.bz.sorters;

public class Node {
    int value;
    Node leftChild;
    Node rightChild;

    Node(int value){
        this.value = value;
        rightChild = null;
        leftChild = null;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}

