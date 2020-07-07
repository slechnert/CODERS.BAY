package com.codersbay;

public class GenericQueueElement<E> {

    E value;
    GenericQueueElement<E> next;

    public GenericQueueElement(E value, GenericQueueElement<E> next) {
        this.value = value;
        this.next = next;
    }


    //Getter
    public E getValue() {
        return value;
    }

    public GenericQueueElement<E> getNext() {
        return next;
    }
}
