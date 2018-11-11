package com.sparta.bz.sorters;

public class BinarySortTree implements BinaryTree {

    private Node rootNode;
    private int numberOfVariables = 1;

    public BinarySortTree(final int element){
        rootNode = new Node(element);
    }
    public BinarySortTree(final int[] elements){
        rootNode = new Node(elements[0]);
        for (int i = 1; i < elements.length; i++){
            addElement(elements[i]);
        }
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return numberOfVariables;
    }

    @Override
    public void addElement(int element) {
        Node node = rootNode;
        boolean exitCriteria = true;
        while (exitCriteria)
        {
            if (element == node.getValue()) {
                return;
            }
            if (element > node.getValue()){
                if(node.getRightChild() != null) {
                   node = node.getRightChild();
                } else {
                    node.setRightChild(new Node(element));
                    numberOfVariables++;
                    exitCriteria = false;
                }
            }else {
                if(node.getLeftChild() != null) {
                    node = node.getLeftChild();
                } else {
                    node.setLeftChild(new Node(element));
                    numberOfVariables++;
                    exitCriteria = false;
                }
            }
        }
    }

    @Override
    public void addElements(int[] elements) {
        for(int i = 0; i < elements.length; i++) {
            addElement(elements[i]);
        }
    }

    @Override
    public boolean findElement(int value) {
        Node node = rootNode;
        while (node != null) {
            if (value == node.getValue()) {
                return true;
            } else if (value > node.getValue()) {
                node = node.getRightChild();
            } else {
                node = node.getLeftChild();
            }
        } return false;
    }

    @Override
    public int getLeftChild(int element) {
        Node node = findNode(element);
        if (node != null){
            return node.getLeftChild().getValue();
        }
        //throw ChildNotFoundException();
        return 0;
    }

    @Override
    public int getRightChild(int element) {
        Node node = findNode(element);
        if (node != null){
            return node.getRightChild().getValue();
        }
        //throw ChildNotFoundException();
        return 0;
    }

    @Override
    public int[] getSortedTreeAsc() {
        return new int[0];
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }

private Node findNode (int element){
    Node node = rootNode;
    while (node !=null){
        if (element == node.getValue()){
            return node;
        }else if(element > node.getValue()){
            node = node.getRightChild();
        }else {
            node = node.getLeftChild();
        }
    }return null;
}
}