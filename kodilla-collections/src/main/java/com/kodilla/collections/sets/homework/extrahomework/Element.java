package com.kodilla.collections.sets.homework.extrahomework;

public class Element {
    private final String value;
    private Element next;
    private Element prev = null;

    public Element(String value) {
        this.value = value;
        this.next = null;
    }

    public String getValue() {
        return value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Element getPrev() {
        return prev;
    }

    public void setPrev(Element prev) {
        this.prev = prev;
    }

}
