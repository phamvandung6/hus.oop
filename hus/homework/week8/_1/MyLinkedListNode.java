package hus.homework.week8._1;

public class MyLinkedListNode {
    private Object payload;
    private MyLinkedListNode next;

    public MyLinkedListNode(Object payload) {
        this.payload = payload;
        this.next = null;
    }

    public MyLinkedListNode(Object payload, MyLinkedListNode next) {
        this.payload = payload;
        this.next = next;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object dataValue) {
        this.payload = dataValue;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public void setNext(MyLinkedListNode nextValue) {
        this.next = nextValue;
    }
}