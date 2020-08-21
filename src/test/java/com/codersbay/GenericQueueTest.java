package com.codersbay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericQueueTest {

    //String Queue Tests

    @Test
    @DisplayName("Length() returns the size of the Queue")
    public void lengthStringTest() {
        GenericQueue<String> testQueue = new GenericQueue<String>();
        assertEquals(0, testQueue.length());
    }

    @Test
    @DisplayName("Enqueue() adds an element to the Queue/ Length() works with non empty Queues as well")
    public void enqueueStringTest() {
        GenericQueue<String> testQueue = new GenericQueue<String>();
        testQueue.enqueue("Momoooooo");
        assertEquals(1, testQueue.length());
    }

    @Test
    @DisplayName("PeekFront() returns the value of the element in the front")
    public void peekFrontStringTest() throws EmptyQueueException {
        GenericQueue<String> testQueue = new GenericQueue<String>();
        testQueue.enqueue("HURRAAAAY");
        testQueue.enqueue("Momoooooo");
        assertEquals("HURRAAAAY", testQueue.peekFront());
    }

    @Test
    @DisplayName("PeekRear() returns the value of the element in the back")
    public void peekRearStringTest() throws EmptyQueueException {
        GenericQueue<String> testQueue = new GenericQueue<String>();
        testQueue.enqueue("HURRAAAAY");
        testQueue.enqueue("Momoooooo");
        assertEquals("Momoooooo", testQueue.peekRear());
    }

    @Test
    @DisplayName("Dequeue() returns and removes the element in the front")
    public void dequeueStringTest() throws EmptyQueueException {
        GenericQueue<String> testQueue = new GenericQueue<String>();
        testQueue.enqueue("HURRAAAAY");
        testQueue.enqueue("Momoooooo");
        testQueue.dequeue();
        assertEquals(1, testQueue.length());
        assertEquals("Momoooooo", testQueue.peekRear());
    }

    //Integer Tests
    @Test
    @DisplayName("Length() returns the size of the Queue")
    public void lengthIntegerTest() {
        GenericQueue<Integer> testQueue = new GenericQueue<Integer>();
        assertEquals(0, testQueue.length());
    }

    @Test
    @DisplayName("Enqueue() adds an element to the Queue/ Length() works with non empty Queues as well")
    public void enqueueIntegerTest() {
        GenericQueue<Integer> testQueue = new GenericQueue<Integer>();
        testQueue.enqueue(1);
        assertEquals(1, testQueue.length());
    }

    @Test
    @DisplayName("PeekFront() returns the value of the element in the front")
    public void peekFrontIntegerTest() throws EmptyQueueException {
        GenericQueue<Integer> testQueue = new GenericQueue<Integer>();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        assertEquals(1, testQueue.peekFront());
    }

    @Test
    @DisplayName("PeekRear() returns the value of the element in the back")
    public void peekRearIntegerTest() throws EmptyQueueException {
        GenericQueue<Integer> testQueue = new GenericQueue<Integer>();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        assertEquals(2, testQueue.peekRear());
    }

    @Test
    @DisplayName("Dequeue() returns and removes the element in the front")
    public void dequeueIntegerTest() throws EmptyQueueException {
        GenericQueue<Integer> testQueue = new GenericQueue<Integer>();
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.dequeue();
        assertEquals(1, testQueue.length());
        assertEquals(2, testQueue.peekRear());
    }

    //Boolean Tests
    @Test
    @DisplayName("Length() returns the size of the Queue")
    public void lengthBooleanTest() {
        GenericQueue<Integer> testQueue = new GenericQueue<Integer>();
        assertEquals(0, testQueue.length());
    }

    @Test
    @DisplayName("Enqueue() adds an element to the Queue/ Length() works with non empty Queues as well")
    public void enqueueBooleanTest() {
        GenericQueue<Boolean> testQueue = new GenericQueue<Boolean>();
        testQueue.enqueue(true);
        assertEquals(1, testQueue.length());
    }

    @Test
    @DisplayName("PeekFront() returns the value of the element in the front")
    public void peekFrontBooleanTest() throws EmptyQueueException {
        GenericQueue<Boolean> testQueue = new GenericQueue<Boolean>();
        testQueue.enqueue(true);
        testQueue.enqueue(false);
        assertEquals(true, testQueue.peekFront());
    }

    @Test
    @DisplayName("PeekRear() returns the value of the element in the back")
    public void peekRearBooleanTest() throws EmptyQueueException {
        GenericQueue<Boolean> testQueue = new GenericQueue<Boolean>();
        testQueue.enqueue(true);
        testQueue.enqueue(false);
        assertEquals(false, testQueue.peekRear());
    }

    @Test
    @DisplayName("Dequeue() returns and removes the element in the front")
    public void dequeueBooleanTest() throws EmptyQueueException {
        GenericQueue<Boolean> testQueue = new GenericQueue<Boolean>();
        testQueue.enqueue(true);
        testQueue.enqueue(false);
        testQueue.dequeue();
        assertEquals(1, testQueue.length());
        assertEquals(false, testQueue.peekRear());
    }
}
