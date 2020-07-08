package com.codersbay;


public class GenericQueue<E> {

   int size = 0;
   GenericQueueElement<E> front;
   GenericQueueElement<E> rear;

   public GenericQueue() {
   }

//Methods

   public int length() {
      return size;
   }

   public void enqueue(E newValue) {
      GenericQueueElement<E> newElement = new GenericQueueElement<E>(newValue, rear);
      rear = newElement;
      size++;
      if (size == 1) {
         front = newElement;
      }
   }

   public E dequeue() throws EmptyQueueException {
      GenericQueueElement<E> oldFront = front;
      if (size == 0) {
         throw new EmptyQueueException("Queue is empty!");
      }
      front = front.getNext();
      size--;
      return oldFront.getValue();
   }

   public E peekFront() throws EmptyQueueException {
      if (size == 0) {
         throw new EmptyQueueException("Queue is empty!");
      }
      return front.getValue();
   }

   public E peekRear() throws EmptyQueueException {
      if (size == 0) {
         throw new EmptyQueueException("Queue is empty!");
      }
      return rear.getValue();
   }

   //Getter & Setter
   public int getSize() {
      return size;
   }

   public void setSize(int size) {
      this.size = size;
   }

   public GenericQueueElement<E> getFront() {
      return front;
   }

   public void setFront(GenericQueueElement<E> front) {
      this.front = front;
   }

   public GenericQueueElement<E> getRear() {
      return rear;
   }

   public void setRear(GenericQueueElement<E> rear) {
      this.rear = rear;
   }
}

