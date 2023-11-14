package hus.homework.week8._1;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void add(Object o) {
        add(o, size);
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            MyLinkedListNode nodeToAdd = new MyLinkedListNode(o, current.getNext());
            current.setNext(nodeToAdd);
        }
        size++;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size);
        MyLinkedListNode node = getNodeByIndex(index);
        return node.getPayload();
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            head = head.getNext();
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            MyLinkedListNode nodeToRemove = current.getNext();
            current.setNext(nodeToRemove.getNext());
            nodeToRemove.setNext(null);
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }
}